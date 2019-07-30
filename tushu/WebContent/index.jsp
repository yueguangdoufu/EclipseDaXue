<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	Connection conn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=TS","myDb","123456");
	System.out.println("连接成功");
	Statement stmt= conn.createStatement();
	ResultSet rs = stmt.executeQuery("select * from xinxi");
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
	.main{
		width:1000px;
		height:100%;
		margin:0;
		
	}
	.main #mz{
		width: 1000px;
		height: 50px;
		margin:auto; 
		vertical-align:middle;
	}
</style>
<div class="main">
	<div id="mz">是个书城</div>

</div>
<table width="300px">
	<tr>
		<th><%out.print("图书编号"); %></th>
		<th><%out.print("书名"); %></th>
		<th><%out.print("作者"); %></th>
		<th><%out.print("价格"); %></th>
	</tr>
<%
	while(rs.next()){
		%>
		<tr>
			<td><%out.print(rs.getString("Bh")+" "); %></td>
			<td><%out.print(rs.getString("Sm")+" "); %></td>
			<td><%out.print(rs.getString("Zz")+" "); %></td>
			<td><%out.print(rs.getDouble("Jg")+" "); %></td>
		</tr>
		<%
	}
%>
</table>
<br>
<lable><a href="login.jsp">管理员登录</a></lable>
</body>
<%
	stmt.close();
	rs.close();
	conn.close();
%>
</html>
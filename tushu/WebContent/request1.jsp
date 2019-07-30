<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	Connection conn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=TS","myDb","123456");
	System.out.println("连接成功");
	Statement stmt= conn.createStatement();
	ResultSet rs = stmt.executeQuery("select * from users");
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

	String name = request.getParameter("user");
	String pwd = request.getParameter("password");
	
	int flag = 1;
	while(rs.next()){
		if(!name.equals(rs.getString("Uname"))){
			flag = 0;
			break;
		}
		if(!pwd.equals(rs.getString("Umi"))){
			flag = 0;
			break;
		}
	}
	if(flag == 0){
		
	}
%>

</body>
</html>
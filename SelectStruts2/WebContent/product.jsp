<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import = "com.start.pojo.Product" %>
    <%@ page import = "java.*" %>
    <%@ page import ="java.util.List" %>
    <%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%List<Product> list = (List)session.getAttribute("list"); %>

<table>
	<tr><th>id</th><th>name</th><th>bar_code</th><th>price</th><th>producer</th></tr>
	
	<%
		for(int i = 0 ; i < list.size(); i ++){
			
			
		}
	%>
	
</table>

</body>
</html>
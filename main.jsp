<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>主界面</title>
</head>
<body bgcolor="#E6E6FA">
<% 
	String username=request.getParameter("username");
%>
<div align="center"><%=username %>,欢迎您！
	 <form action="LoginOutServlet" method="post">
	 	<input type="submit" value="注销">
	 </form>
</div>
<%
	session.invalidate();
%>
</body>
</html>
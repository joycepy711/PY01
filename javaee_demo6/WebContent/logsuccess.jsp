<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body bgcolor="#E6E6FA">
<div align="center">
	<h1>欢迎<s:property value = "username"/>,登录成功！</h1>
    <br>
    <form action="logout" method="post">
    	<input type="submit" value="退出">
    </form>
</div>
</body>
</html>
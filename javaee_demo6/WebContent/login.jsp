<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录界面</title>
</head>
<body bgcolor="#E6E6FA">
	<div align="center">
		<h3>请输入要删除的姓名</h3>
		<s:form action ="login" method ="post">
			<s:textfield label="姓名" name="name"></s:textfield>
			<s:submit value = "确定"></s:submit>
	   </s:form>
	       若还未注册，请先<font color="red" size="3"><a href="register.jsp">注册</a></font>
	</div>	
</body>
</html>
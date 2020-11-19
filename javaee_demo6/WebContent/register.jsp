<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册界面</title>
</head>
<body bgcolor="#E6E6FA">
	<h3>请注册</h3>
	<s:form action = "logup" method = "post" >
   		<s:textfield label="用户名" name="username"></s:textfield>
    	<h3 style="color: red"><s:fielderror fieldName="username"></s:fielderror></h3>
   		<s:password label="密码" name="password"></s:password>
	   <h3 style="color: red"><s:fielderror fieldName="password"></s:fielderror></h3>
	   <s:submit value = "注册"></s:submit>
	 </s:form><br>
        已有账号？<a href="login.jsp">点击此处登录</a>
</body>
</html>
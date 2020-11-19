<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册界面</title>
</head>
<body bgcolor="#E6E6FA">
	<h3 align="center">请注册</h3>
	<div style="width:100%;text-align:center">	
		<form action="RegServlet" method="get" id="user">
		<table align="center">
			<tr><td>用户名:</td><td><input type="text" name="username"></td></tr>
			<tr><td>密码:</td><td><input type="password" name="userpassword"></td></tr>
			<tr><td>邮箱:</td><td><input type="text" name="useremail"></td></tr>
		</table>
			<input type="submit" value="确定">
		</form>
	</div>
</body>
</html>
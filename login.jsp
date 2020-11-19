<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录界面</title>
</head>
<body bgcolor="#E6E6FA">
<h3 align="center">请登录</h3>
<div align="center">
<form action="LoginServlet" method="post">
    <table align="center">
				<tr><td>用户名:</td><td><input type="text" name="username"></td></tr>
				<tr><td>密码:</td><td><input type="password" name="userpassword"></td></tr>
			</table>
			<input type="submit" value="确定"><br/>
    <div style="text-align:center">若还未注册，请先<font color="red" size="3"><a href="register.jsp">注册</a></font></div>	
</form>
</div>
<script>
    var error ='<%=request.getParameter("error")%>';
    if(error == 'yes')
    {
        alert("用户名或者密码错误!");
    }
    if(error == 'no')
    {
        alert("注册失败!");
    }
</script>
</body>
</html>
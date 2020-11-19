<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>文件上传错误信息显示页面</title>
</head>
<body bgcolor="#E6E6FA">
	<h3>文件上传失败！</h3><br>
	<a href="upload.jsp">重新上传</a>
    <s:actionerror/>
    <s:fielderror/>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>文件上传显示页面</title>
</head>
<body bgcolor="#E6E6FA">
	文件上传成功！展示如下：
    <br/><br/>
	<img width="300" src="${pageContext.request.contextPath}/<s:property value="'images/'+imageFileName"/>">
	<s:debug></s:debug>
</body>
</html>
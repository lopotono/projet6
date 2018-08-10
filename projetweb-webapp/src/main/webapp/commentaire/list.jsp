<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<%@ include file="../_include/head.jsp"%>
<link href="css/bootstrap.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="style.css" />
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<s:iterator value="listCommentaire">
				<div class="list-group">
					<s:property value="name" />
					<span class="label label-info"><s:property value="contain" /></span>
				</div>
			</s:iterator>
		</div>
	</div>

	<span class="label label-danger">Danger Label</span>
</body>
</html>
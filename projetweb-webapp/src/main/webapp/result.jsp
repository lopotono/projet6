<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="./_include/head.jsp"%>
<link href="css/bootstrap.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="style.css" />
</head>
<body>
<h1>
		<span class="label label-success">Sites d'escalade :</span>
	</h1>

	<s:iterator value="searchsite">
	<div class="panel panel-info">
			<div class="list-group">
			<s:a action="site.action" class="list-group-item">
				<li><result> <s:property value="name" /><br />
					<s:param name="id" value="sitesid" /></result></li>
			</s:a>
			</div>
			</div>
		
	</s:iterator>

	<h1>
		<span class="label label-success">Secteurs d'escalade :</span>
	</h1>
	<s:iterator value="searchsecteur">
	<div class="panel panel-info">
			<div class="list-group">
		<s:property value="name"/>
		</div>
		</div>
		<br />
	</s:iterator>

	<h1>
		<span class="label label-success">Voies d'escalade :</span>
	</h1>
	<s:iterator value="searchvoie">
	<div class="panel panel-info">
	<div class="list-group">
		<s:property value="name"/>
		<br />	
		</div>
		</div>
	</s:iterator>
</body>
</html>
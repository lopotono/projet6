<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="./_include/head.jsp"%>
</head>
<body>
	<h2>Sites d'escalade :</h2>
	<s:iterator value="searchsite">
		<ul>
			<s:a action="site.action">
				<li><result> <s:property value="name" /><br />
					<s:param name="id" value="sitesid" /></result></li>
			</s:a>
		</ul>
	</s:iterator>

	<h2>Secteur d'escalade :</h2>
	<s:iterator value="searchsecteur">
		<s:property value="name" />
		<br />
	</s:iterator>
	
	<h2>Nom de la voie :</h2>
	<s:iterator value="searchvoie">
		<s:property value="name"/>
		<br />	
	</s:iterator>
</body>
</html>
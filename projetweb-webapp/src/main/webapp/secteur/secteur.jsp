<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="../_include/head.jsp"%>
</head>
<body>
	<h2>Liste des secteurs</h2>


	<ul>
		<s:iterator value="listSecteur">
			<li>Nom : <s:property value="secteurname" />
			</li>
		</s:iterator>
	</ul>
	
	<s:a action="secteur_detail">site</s:a>
</body>
</html>
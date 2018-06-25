<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="./_include/head.jsp"%>
<link href="assets/css/bootstrap.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="style.css" />
</head>

<body>
	<div>
		<ul>
			<li><s:a action="index" class="active">ACCUEIL</s:a></li>
			<li><s:a action="sites_list">LISTE DES SITES D'ESCALADE</s:a></li>
			<s:if test="#session.user">
			<li><s:a action="topos_list">EMPRUNTER TOPO</s:a></li>		
			<li><s:a action="user_list">COORDONNEES UTILISATEURS</s:a></li>
			</s:if>
			<li><%@ include file="./_include/header.jsp"%></li>
			<s:form action="search" method="post">
				<s:textfield name="name" requiredLabel="true" />
				<s:submit value="Recherche" />
			</s:form>
		</ul>
	</div>
	
	<img alt="imageescalade" src="Escalade-chamonix3.jpg" />
</body>
</html>

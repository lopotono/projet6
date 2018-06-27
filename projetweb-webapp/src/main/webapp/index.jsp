<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="./_include/head.jsp"%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
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
			<li><s:a action="ajout">AJOUT DE SITE</s:a></li>
			<li><s:a action="ajout_topo">AJOUT DE TOPO</s:a></li>
			</s:if>
			<li><%@ include file="./_include/header.jsp"%></li>
			<s:form action="search" method="post">
				<s:textfield name="name" requiredLabel="true" />
				<s:submit value="Recherche" />
			</s:form>
		</ul>
	</div>
	
	<s:form method="post" action="ajout">
		<s:textfield name="name" label="Nom du site" requiredLabel="true"/>
		<s:textfield name="id_topo" label="Numéro topo" requiredLabel="true"/>
		<s:textfield name="description" label="description du site" requiredLabel="true"/>
		<s:submit value="Ajouter" />	
	</s:form>
	<img alt="imageescalade" src="Escalade-chamonix3.jpg" />
</body>
</html>

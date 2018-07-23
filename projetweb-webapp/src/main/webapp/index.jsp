<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="./_include/head.jsp"%>
<link href="css/bootstrap.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="style.css" />
</head>

<body>
	<div class="container">
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="container-fluid">
				<ul class="nav navbar-nav">
					<li><s:a action="index" class="active">ACCUEIL</s:a></li>
					<li><s:a action="sites_list">SITES D'ESCALADE</s:a></li>
					<s:if test="#session.user">
						<li><s:a action="emprunt">EMPRUNTER TOPO</s:a></li>
						<li><s:a action="user_list">INFOS UTILISATEURS</s:a></li>
						<li><s:a action="addsite">AJOUT DE SITE</s:a>
							<ul class="submenu">
								<li><s:a action="addsecteur">AJOUT DE SECTEUR</s:a></li>
								<li><s:a action="addvoie">AJOUT DE VOIE</s:a></li>
								<li><s:a action="ajouttopo">AJOUT DE TOPO</s:a></li>
								<li><s:a action="addpoints">AJOUT DES POINTS</s:a></li>
								<li><s:a action="addlongueur">AJOUT DES LONGUEURS</s:a></li>
							</ul></li>
					</s:if>
					<li><%@ include file="./_include/header.jsp"%></li>
				</ul>
			</div>
		</nav>
	</div>

	<s:form action="search" method="post"
		class="navbar-form navbar-right inline-form">
		<s:textfield name="name" requiredLabel="true" placeholder="Recherche"
			class="input-lg form-control" />
		<s:submit value="Chercher" class="btn btn-primary btn-lg" />
	</s:form>
</body>
</html>
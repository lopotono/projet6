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
						<li><s:a action="listeemprunt">LISTE EMPRUNTS</s:a></li>
						<li><s:a action="addsite">AJOUT DE SITE</s:a>
							<ul class="submenu">
								<li><s:a action="addsecteur">AJOUT DE SECTEUR</s:a></li>
								<li><s:a action="addvoie">AJOUT DE VOIE</s:a></li>
								<li><s:a action="ajouttopo">AJOUT DE TOPO</s:a></li>
								<li><s:a action="addlongueur">AJOUT DES LONGUEURS</s:a></li>
							</ul></li>
					</s:if>
					<li><%@ include file="./_include/header.jsp"%></li>
				</ul>
			</div>
		</nav>
	</div>

	<s:form action="search" method="post" id="searchthis">
		<s:textfield name="name" requiredLabel="true"
			placeholder="Recherche..." id="search" />
		<s:submit value="Chercher" id="search-btn" />
	</s:form>

	<div class="row">
		<div class="col-sm-6 col-md-8">
			<div class="thumbnail">
				<h1>Rappel de vocabulaire</h1>
				<p>Un site ou spot, c’est un lieu où il est possible de grimper.</p>
				<p>Les sites peuvent être découpés en plusieurs secteurs qui
					regroupent un ensemble de voies.</p>
				<p>Une voie est le chemin à emprunter par le grimpeur pour
					arriver à destination : le haut de la voie. Si la voie est découpée
					en plusieurs « parties » à grimper les unes après les autres, ces
					parties s’appellent des longueurs et on trouve un relai en haut de
					chaque longueur.</p>
				<p>Quand le grimpeur arrive en haut de la longueur, c’est à ce
					relai qu’il se vache, c’est à dire qu’il s’y accroche, avec à
					l’aide de sa vache ou longe (corde nouée sur le baudrier du
					grimpeur et équipée d’un mousqueton à verrouillage).</p>
				<p>Les points ou spits sont des ancrages fixes que l’on trouve
					dans les voies dites « équipées » et qui permettent au grimpeur de
					s’assurer au fur et à mesure de sa progression, à l’aide de
					dégaines.</p>
				<p>La cotation d’une longueur ou d’une voie, représente sa
					difficulté. En France, le système de cotation va, en gros, par
					ordre croissant de difficulté, de 3 à 9c. Le chiffre est en quelque
					sorte, l’unité principale et la lettre une sous-unité (de « A » à «
					C »).</p>
				<p>Un topo est un recueil contenant toutes les informations
					utiles sur les sites d’escalade d’une région (les secteurs, les
					voies, leur hauteur, leur cotation, le nombre de points…).</p>
			</div>
		</div>
	</div>

	<s:actionmessage />
</body>
</html>
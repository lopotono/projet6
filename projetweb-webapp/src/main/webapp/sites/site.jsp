<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="../_include/head.jsp"%>
<link href="css/bootstrap.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="style.css" />
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<ul class="nav navbar-nav">
				<li><s:a action="index" class="active">ACCUEIL</s:a></li>
				<s:if test="#session.user">
					<li><s:a action="topos_list">EMPRUNTER TOPO</s:a></li>
					<li><s:a action="user_list">COORDONNEES UTILISATEURS</s:a></li>
				</s:if>
				<li><%@ include file="../_include/header.jsp"%></li>
			</ul>
		</div>
		</nav>
	</div>
	<br />

	<h1>
		<span class="label label-success"><s:property value="site.name" /></span>
	</h1>
	<s:iterator value="site.secteurs">
		<div class="panel panel-info">
			<div class="list-group">

				<dt>
					Secteur :
					<s:property value="name" />
				</dt>

			</div>
		</div>

		<div class="panel panel-info">
			<div class="list-group">
				<s:iterator value="voie">
					<dt>
						Nom de la voie :
						<s:property value="name" />
					</dt>
					<dt>
						Hauteur de voie :
						<s:property value="hauteur" />
					</dt>
					<dt>
						Cotation de voie :
						<s:property value="numerocotation" />
					</dt>
			</div>
		</div>


		<div class="panel panel-info">
			<div class="list-group">
				<s:iterator value="longueur">
					<dt>
						Nombre de longueur :
						<s:property value="longueurnombre" />
					</dt>
			</div>
		</div>

		<div class="panel panel-info">
			<div class="list-group">

				<s:iterator value="points">
					<dt>
						Nombre de points :
						<s:property value="pointsnombre" />
					</dt>
			</div>
		</div>
	</s:iterator>
	</s:iterator>
	</s:iterator>
	</s:iterator>
</body>
</html>
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

	<div class="main">
		<div class="row">
			<div class="col-xs-12">
				<p>Le prêt de topo d'escalade est fixé pour une durée d'un mois à partir de la date en cours.</p>
				<p>Le prêt de topo d'escalade est non renouvelable.</p>
			</div>
		</div>
	</div>
	<div class="jumbotron text-center">
		<h1>Emprunt de topo d'escalade</h1>
		<p>Choisir le topo dans la liste</p>
		<br /> <br />
		<div class="container">
			<div class="row">
				<div class="col-sm-10">
					<s:form method="post" action="emprunt">

						<s:textfield name="name" placeholder="Nom Utilisateur"
							requiredLabel="true" readonly="true" class="form-control" />

						<s:select name="topoid" list="listTopos" listKey="id"
							listValue="toposname" />

						<s:submit value="EMPRUNTER" class="btn1 btn-primary btn-lg" />

					</s:form>

					<s:a action="index" class="btn btn-primary btn-md pull-left">Retour accueil</s:a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
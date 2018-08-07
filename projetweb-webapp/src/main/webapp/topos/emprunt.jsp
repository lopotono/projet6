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

	<div class="jumbotron text-center">
		<h1>Emprunt de topo d'escalade</h1>
		<p>Remplir le formulaire d'emprunt</p>
		<br />
		<br />
		<div class="container">
			<div class="row">
				<div class="col-sm-10">
					<s:form method="post" action="emprunt">

						<s:textfield name="datedebut"
							placeholder="Date de début du prêt" requiredLabel="true" type="date"
							 class="form-control" />

						<s:textfield name="datefin"
							placeholder="Date de fin du prêt" requiredLabel="true" type="date"
							class="form-control" />
					
						<s:textfield name="name" placeholder="Nom Utilisateur" requiredLabel="true" readonly="true" class="form-control" />
						
						<s:select name="topoid" list="listTopos" listKey="id"
							listValue="toposname" />

						<s:submit value="EMPRUNTER" class="btn1 btn-primary btn-lg" />
						
						<s:submit value="SAUVEGARDER" class="btn1 btn-primary btn-lg" />

					</s:form>
					<s:a action="index" class="btn btn-primary btn-md pull-left">Retour accueil</s:a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
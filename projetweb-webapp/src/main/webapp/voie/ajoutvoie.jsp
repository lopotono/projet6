<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<%@ include file="../_include/head.jsp"%>
<link href="css/bootstrap.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="style.css" />
</head>
<body>

	<div class="jumbotron text-center">
		<h1>Ajout de voie d'escalade</h1>
		<p>Remplir le formulaire d'ajout</p>

		<div class="container">
			<div class="row">
				<div>
					<s:form method="post" action="addvoie">
						<s:textfield name="name" requiredLabel="true"
							placeholder="Nom de la voie" class="form-control" />

						<s:textfield name="hauteur" requiredLabel="true"
							placeholder="Hauteur" class="form-control" />

						<s:textfield name="numero" requiredLabel="true"
							placeholder="Numéro de cotation" class="form-control" />

						<s:textfield name="points" requiredLabel="true"
							placeholder="Nombre de points" class="form-control" />

						<s:select name="idsecteur" list="listSecteur" listKey="id"
							listValue="name" />

						<s:submit value="AJOUTER" class="btn1 btn-success btn-lg" />
					</s:form>
					<s:a action="index" class="btn btn-primary btn-md pull-left">Retour accueil</s:a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
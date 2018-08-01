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
		<h1>Ajout d'un site d'escalade</h1>
		<p>Remplir le formulaire d'ajout</p>
		<s:a action="index" class="btn btn-primary btn-lg">Retour</s:a>
	</div>


	<div class="container">
		<div class="row">
			<div>
				<s:form method="post" action="addsite">
					<s:textfield name="name" requiredLabel="true"
						placeholder="Nom du site d'escalade" class="form-control" />

					<s:select name="idtopo" list="listTopos" listKey="id"
						listValue="toposname" />

					<s:textarea placeholder="Description du site d'escalade..."
						name="description" requiredLabel="true" cols="50" rows="10"
						class="form-control" />

					<s:submit value="AJOUTER" class="btn1 btn-success btn-lg" />
				</s:form>
			</div>
		</div>
	</div>
</body>
</html>
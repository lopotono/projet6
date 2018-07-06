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
	<s:a action="index" class="btn btn-primary btn-lg">Retour</s:a>
	
	<div class="container">
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4 login_bg">
				<s:form method="post" action="ajout">
					<s:textfield name="name" requiredLabel="true"
						placeholder="Nom du site" class="form-control" />

					<s:textfield name="id_topo" requiredLabel="true"
						placeholder="Numéro topo" class="form-control" />

					<s:textfield name="description" requiredLabel="true"
						placeholder="Description du site" class="form-control" />

					<s:submit value="Ajouter" class="btn1 btn-primary btn-lg" />
				</s:form>
			</div>
		</div>
	</div>
</body>
</html>
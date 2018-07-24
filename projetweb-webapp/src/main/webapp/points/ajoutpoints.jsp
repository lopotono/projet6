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
			<div class="col-sm-12 login_bg">
				<s:form method="post" action="addpoints">
					<s:textfield name="id" requiredLabel="true"
						placeholder="Numéro point" class="form-control" />

					<s:textfield name="nbpoints" requiredLabel="true"
						placeholder="Nombre de points" class="form-control" />

					<s:textfield name="id_longueur" requiredLabel="true"
						placeholder="Numéro de longueur" class="form-control" />

					<s:submit value="Ajouter" class="btn1 btn-primary btn-lg" />
				</s:form>
			</div>
		</div>
	</div>
</body>
</html>
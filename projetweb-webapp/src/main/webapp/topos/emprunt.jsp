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
	<s:a action="index" class="btn btn-primary btn-lg">Retour</s:a>
	<div class="container">
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4 login_bg">
				<s:form method="post" action="emprunt">
					<s:textfield name="name" placeholder="Nom du topo"
						requiredLabel="true" class="form-control" />

					<s:select name="topoid" list="listTopos" listKey="id" listValue="toposname"/>
					
					<s:submit value="Emprunter" class="btn1 btn-primary btn-lg" />
				</s:form>
			</div>
		</div>
	</div>
</body>
</html>
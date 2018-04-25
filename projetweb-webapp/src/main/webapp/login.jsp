<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<%@ include file="./_include/head.jsp" %>
</head>

<body>
	<%@ include file="./_include/header.jsp" %>
	
	<h2>Connexion</h2>
	
	<s:form method="post" action="login">
		<s:textfield name="login" label="Identifiant" requiredLabel="true" />
		<s:password name="password" label="Mot de passe" requiredLabel="true" />
		
		<s:submit value="Connexion" />
	</s:form>
</body>
</html>
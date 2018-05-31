<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="../_include/head.jsp"%>
</head>

<body>
	<s:actionerror />
	<s:actionmessage />

	<h2>Ajout d'un topo</h2>

	<s:form action="topos_new">
		<s:textfield name="topos.nom" label="Nom" requiredLabel="true" />
		<s:select name="topos.utilisateur.nom" label="Responsable"
			list="listUser" listKey="nom" listValue="prenom" emptyOption="true"
			requiredLabel="true" />
		<s:checkbox name="topos.cloture" label="Cloturé" />
		<s:submit value="OK" />
		
		<input type="submit" value="Emprunter topo" class="sansLabel" />
	</s:form>
</body>
</html>
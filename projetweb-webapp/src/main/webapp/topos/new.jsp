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

	<s:form action="topos_new" method="post">
		<s:textfield label="%{getText('data.toposname')}" name="topo.toposname" size="30"/>
		<s:textfield label="%{getText('data.topodispo')}" name="topo.topodispo" size="10"/>
		<s:textfield label="%{getText('data.username)}" name="topo.username" size="30"/>	
	</s:form>
</body>
</html>
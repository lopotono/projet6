<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
	<%@ include file="./_include/head.jsp" %>
</head>

<body>
	<%@ include file="./_include/header.jsp" %>
<h2>Hello World!</h2>
	<ul>
		<li>  
			<s:a action="topos_list">Liste des topos</s:a>
		</li>
		<li>
			<s:a action="sites_list">Liste des sites</s:a>
		</li>
		<li>
			<s:a action="user_list">Liste des utilisateurs</s:a>
		</li>
	
		<br />
		<li>
			<s:a action="form_new">Formulaire d'inscription</s:a>
		</li>		
	</ul>	
</body>
</html>

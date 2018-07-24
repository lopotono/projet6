<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<header>
<link href="css/bootstrap.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="style.css" />
 <s:if test="#session.user">
            Utilisateur connecté :
            <s:property value="#session.user.name" />
	<br />
	<s:a action="logout" class="btn btn-primary btn-sm">DECONNEXION</s:a>
</s:if> <s:else>
	
		<s:a action="login" class="btn btn-primary btn-lg">CONNEXION</s:a>
	
</s:else> </header>

<s:actionerror />
<s:actionmessage />
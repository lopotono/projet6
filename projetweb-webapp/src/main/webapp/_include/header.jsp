<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<header>
    <s:if test="#session.user">
            Utilisateur connecté :
            <s:property value="#session.prenom_user" />
            <s:property value="#session.nom_user" />

            <s:a action="logout">Déconnexion</s:a>
    </s:if>
    <s:else>
        <s:a action="login">Connexion</s:a>
    </s:else>
</header>

<nav>
	<s:a action="topos_list">
		<s:text name="Liste des topos"></s:text>
	</s:a>
	
	<s:a action="topos_new">Déposer un topo</s:a>
</nav>

<s:actionerror/>
<s:actionmessage/>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="form/form.css" />
<%@ include file="../_include/head.jsp"%>
</head>

<body>
	<h2>Formulaire d'inscription</h2>
	
	<s:form method="post" action="form_new">
	<fieldset> 
		<legend>Inscription</legend>
		<p>Inscription via ce formulaire.</p>
		
		<s:label for="nom">Nom <span class="requis">*</span></s:label>
		<input type="text" id="nom" name="nom" value="" size="20" maxlength="60"/>
		
		<br />
		
		<s:label for="prenom">Prénom <span class="requis">*</span></s:label>
		<input type="text" id="prenom" name="prenom" value="" size="20" maxlength="60"/>
		
		<br />
		
		<s:label for="adresse">Adresse <span class="requis">*</span></s:label>
		<input type="text" id="adresse" name="adresse" value="" size="20" maxlength="60"/>
		
		<br />
		
		<s:label for="codepostal">Code postal <span class="requis">*</span></s:label>
		<input type="text" id="codepostal" name="codepostal" value="" size="20" maxlength="20"/>
		
		<br />
		
		<s:label for="ville">Ville <span class="requis">*</span></s:label>
		<input type="text" id="adresse" name="adresse" value="" size="20" maxlength="60"/>
		
		<br />
		
		<s:label for="motdepasse">Mot de passe <span class="requis">*</span></s:label>
		<input type="password" id="motdepasse" name="motdepasse" value="" size="20" maxlength="20"/>
		
		<br />
		
		<s:label for="confirmation">Confirmation du mot de passe <span class="requis">*</span></s:label>
		<input type="password" id="confirmation" name="confirmation" value="" size="20" maxlength="20"/>
		
		<br />
		
		<input type="submit" value="Inscription" class="sansLabel" />
		
	</fieldset>
	</s:form>
</body>
</html>
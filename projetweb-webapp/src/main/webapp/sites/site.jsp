<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="../_include/head.jsp"%>
<link rel="stylesheet" href="sites/styleSites.css" />
</head>
<body>
	<p>Détails du site d'escalade : 
	<s:property value="site.name" /></p>
	<p><s:property value="site.description" /></p>
	<br />
	<table>
	<tr>
			<s:iterator value="site.secteurs">
				<td>Secteur : <s:property value="name" /></td>
				<br />

				<s:iterator value="voie">
					<td>Nom de la voie : <s:property value="name" /></td>
					<td>Hauteur de voie : <s:property value="hauteur" /></td>
					<td>Cotation de voie : <s:property value="numerocotation" /></td>

					<s:iterator value="longueur">
						<td>Nombre de longueur : <s:property value="longueurnombre" /></td>

						<s:iterator value="points">
							<td>Nombre de points : <s:property value="pointsnombre" /></td>
						</s:iterator>
					</s:iterator>
				</s:iterator>
			</s:iterator>
		</tr>
	</table>
</body>
</html>
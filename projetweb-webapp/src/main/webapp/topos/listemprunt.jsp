<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="../_include/head.jsp"%>
<link type="text/css" rel="stylesheet" href="style2.css" />
<link href="css/bootstrap.css" rel="stylesheet">
<body>
	<div class="container">
		<table class="table table-striped">
			<caption>
				<p>
					LISTE DES TOPOS EMPRUNTÉS PAR
					<s:property value="#session.user.name" />
				</p>
			</caption>
			<thead>
				<tr>
					<th>Nom du topo</th>
					<th>Date d'emprunt</th>
					<th>Date de fin d'emprunt</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="listEmpruntTopos">
					<tr class="success">
						<td><s:property value="toponame.toposname" /></td>

						<td><s:date name="datedebut" format="dd/MM/yyyy" /></td>
						<td><s:date name="datefin" format="dd/MM/yyyy" /></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
		<s:a action="index" class="btn btn-primary btn-md pull-left">Retour accueil</s:a>
	</div>
</body>
</html>
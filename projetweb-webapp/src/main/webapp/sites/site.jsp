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
	<s:a action="sites_list" class="btn btn-primary btn-md pull-left">Retour liste</s:a>
	<s:a action="index" class="btn btn-primary btn-md pull-left">Retour recherche</s:a>
	<div class="container">
		<div class="jumbotron">
			<h1>Détail du site d'escalade</h1>
			<br />
			<h1>
				<div class="panel-heading">
					<span class="label label-success"><s:property
							value="site.name" /></span>
				</div>
			</h1>
			<br />
			<div class="list-group-item">
			<s:iterator value="site.commentaire">
				<dt>
					<s:property value="name" />
					<s:property value="contain" />
				</dt>
			</s:iterator>
			</div>

			<div class="list-group">
				<s:iterator value="site.secteurs">

					<dt>
						Secteur :
						<s:property value="name" />
					</dt>

					<s:iterator value="voie">
						<dt>
							Nom de la voie :
							<s:property value="name" />
						</dt>
						<dt>
							Hauteur de voie :
							<s:property value="hauteur" />
						</dt>
						<dt>
							Cotation de voie :
							<s:property value="numerocotation" />
						</dt>
						<s:iterator value="longueur">
							<dt>
								Nombre de longueur :
								<s:property value="longueurnombre" />
							</dt>
							<s:iterator value="points">
								<dt>
									Nombre de points :
									<s:property value="pointsnombre" />
								</dt>
							</s:iterator>
						</s:iterator>
					</s:iterator>
				</s:iterator>
			</div>
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="../_include/head.jsp"%>
<link href="css/bootstrap.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="style3.css" />
<link rel="stylesheet" type="text/css" href="/css/app.css" />
<link rel="stylesheet" type="text/css"
	href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />
<link rel="stylesheet" type="text/css"
	href="http://fonts.googleapis.com/css?family=Lato:400,700,300" />
</head>
<body>

	<div class="container">
		<s:a action="index" class="btn btn-primary btn-md pull-right">Retour accueil</s:a>
		<div class="jumbotron">
			<h1>LES SITES D'ESCALADE</h1>
			<p><a href="#ancre">Ajouter un commentaire sur un site d'escalade</a></p>
			<s:iterator value="listSites">
				<div>
					<div class="list-group">
						<s:a action="site.action" class="list-group-item">
							<result>
							<h2>
								<span class="label label-success"><s:property
										value="name" /></span>
							</h2>
							<s:property value="description" /> <s:param name="id"
								value="sitesid" /></result>
						</s:a>
					</div>
				</div>
			</s:iterator>

			<s:a action="index" class="btn btn-primary btn-md pull-right">Retour accueil</s:a>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<div id="ancre">
					<div class="main">
						<div class="row">
							<div class="col-xs-12 col-sm-6 col-sm-offset-1">
								<h1>Ajouter un commentaire sur un site d'escalade</h1>
								<s:form method="post" action="addcommentaire"
									class="form-horizontal">

									<div class="form-group">
										<div class="col-md-8">
											<s:textfield name="name" requiredLabel="true"
												placeholder="Nom du commentaire" class="form-control" />
										</div>
									</div>

									<div class="form-group">
										<div class="col-md-8">
											<s:textarea placeholder="Votre commentaire..." name="contain"
												requiredLabel="true" cols="20" rows="5" class="form-control" />
										</div>
									</div>

									<div class="form-group">
										<div class="col-md-8">
											<s:select name="idsite" list="listSites" listKey="sitesid"
												listValue="name" class="form-control" />
										</div>
									</div>

									<div class="form-group">
										<div class="col-md-offset-0 col-md-8">
											<s:submit value="ENVOYER" class="btn btn-success btn-lg" />
										</div>
									</div>

								</s:form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
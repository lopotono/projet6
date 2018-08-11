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

	<div class="container">
		<div class="jumbotron">
			<h1>Liste des sites d'escalade</h1>
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
</body>
</html>
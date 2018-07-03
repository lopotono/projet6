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
		<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<ul class="nav navbar-nav">
				<li><s:a action="index" class="active">ACCUEIL</s:a></li>
				<s:if test="#session.user">
					<li><s:a action="topos_list">EMPRUNTER TOPO</s:a></li>
					<li><s:a action="user_list">COORDONNEES UTILISATEURS</s:a></li>
				</s:if>
				<li><%@ include file="../_include/header.jsp"%></li>
			</ul>
		</div>
		</nav>
	</div>


	<s:iterator value="listSites">
		<div class="panel panel-info">
			<div class="list-group">
				<s:a action="site.action" class="list-group-item">
					<result>
					<h1>
						<span class="label label-success"><s:property value="name" /></span>
					</h1>
					<s:property value="description" />
					<s:param name="id" value="sitesid" /></result>
				</s:a>
				
			</div>
		</div>
	</s:iterator>
</body>
</html>
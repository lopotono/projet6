<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="../_include/head.jsp"%>
</head>

<body>
	<h2>Liste des topos</h2>

	<s:iterator value="listTopos">
		<ul>
			<s:a action="topo.action">
				<li><result> <s:property value="toposname" /> 
				<s:param name="id" value="id" /></result></li>
			</s:a>
		</ul>
	</s:iterator>
</body>
</html>

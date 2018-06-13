<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Site :
	<s:property value="site.sitesname" />
	<br />

	<ul>
		<s:iterator value="site.secteurs">
			<li>Secteur : <s:property value="secteurname" /></li>
			<br />
			<ul>
				<s:iterator value="voie">
					<li>Voie id : <s:property value="id" /></li>
					<li>Nom de la voie : <s:property value="nomvoie" /></li>
					<li>Hauteur de voie : <s:property value="voiehauteur" /></li>
					<li>Cotation de voie : <s:property value="voienumerocotation" /></li>
					<ul>
						<s:iterator value="longueur">
							<li>Longueur id : <s:property value="id" /></li>
							<li>Nombre de longueur : <s:property value="longueurnombre" /></li>
							<ul>
								<s:iterator value="points">
									<li>Points id : <s:property value="id" /></li>
									<li>Nombre de points : <s:property value="pointsnombre" /></li>
								</s:iterator>
							</ul>
						</s:iterator>
					</ul>
				</s:iterator>
			</ul>
		</s:iterator>
	</ul>
</body>
</html>
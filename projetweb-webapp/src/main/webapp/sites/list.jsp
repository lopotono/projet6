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
	<h2>Liste des sites</h2>

	<s:iterator value="listSites">
		<ul>
			<s:a action="site.action">
				<li><result> <s:property value="sitesname" />
					<s:param name="id" value="sitesid" /></result></li>
			</s:a>
		</ul>
	</s:iterator>
</body>
</html>
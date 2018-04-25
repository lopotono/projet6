<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Détail du site</h2>
	
	<s:a action="sites_detail">
                    <s:param name="id" value="id" />
                    <s:property value="nom" />
                </s:a> 

    <ul>
        <li>ID : <s:property value="sites.id" /></li>
        <li>Nom : <s:property value="sites.nom" /></li>    
    </ul>
</body>
</html>
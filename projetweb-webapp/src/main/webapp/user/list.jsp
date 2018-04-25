<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@ include file="../_include/head.jsp"%>
</head>
<body>
	<h2>Liste des utilisateurs</h2>
	<ul>
	<s:iterator value="listUser">
        	 - Propriétaire du topo :
        	 <li>
              	<s:a action="user_list">
              		<s:param name="id" value="id"/>
                    <s:property value="username" />
                </s:a>
             </li>
        </s:iterator>
      </ul>
</body>
</html>
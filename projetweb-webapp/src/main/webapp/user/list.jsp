<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="user/table.css"/>
<%@ include file="../_include/head.jsp"%>
</head>
<body>
	<h2>Liste des utilisateurs</h2>
	        <ul>      	 	
        	 	<s:iterator value="listUser">
        	 	<table>       	 	
				<tr>
					<td><s:property value="username" /></td>
					
					<td><s:property value="userprenom" /></td>
					
					<td><s:property value="usermail" /></td>
				
					<td><s:property value="useradresse" /></td>
					
					<td><s:property value="usercodepostal" /></td>
				
					<td><s:property value="userville" /></td>
				</tr>
			</table>
		</s:iterator>
	</ul>
</body>
</html>
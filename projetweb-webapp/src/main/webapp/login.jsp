<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<%@ include file="./_include/head.jsp"%>
<link type="text/css" rel="stylesheet" href="styleLog.css" />
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-4 col-sm-offset-4 login_bg">
				<%@ include file="../_include/header2.jsp"%>
				<s:form method="post" action="login">
					<div class="form-group">
						<s:textfield name="name" requiredLabel="true" class="form-control"
							placeholder="Votre nom" />
					</div>
					<div class="form-group">
						<s:password name="password" requiredLabel="true" class="form-control"
							placeholder="Mot de passe" />
					</div>
					<s:submit value="CONNEXION" class="btn btn-block login_btn" />
				</s:form>
			</div>

		</div>
	</div>
</body>
</html>
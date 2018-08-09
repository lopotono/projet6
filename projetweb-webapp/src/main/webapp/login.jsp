<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<%@ include file="./_include/head.jsp"%>
<link href="css/bootstrap.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="styleLog.css" />
<link rel="stylesheet" type="text/css" href="/css/app.css" />
<link rel="stylesheet" type="text/css"
	href="http://fonts.googleapis.com/css?family=Open+Sans:400,300" />
<link rel="stylesheet" type="text/css"
	href="http://fonts.googleapis.com/css?family=Lato:400,700,300" />
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-xs-12">

				<div class="main">
					<div class="row">
						<div class="col-xs-12 col-sm-6 col-sm-offset-1">
							
							<h1>Page de connexion</h1>
							<s:form method="post" action="login" class="form-horizontal">
								<%@ include file="../_include/header2.jsp"%>
								<div class="form-group">
									<div class="col-md-8">								
										<s:textfield name="name" requiredLabel="true"
											class="form-control" placeholder="Identifiant" />
									</div>

									<div class="form-group">
										<div class="col-md-8">
											<s:password name="password" requiredLabel="true"
												class="form-control" placeholder="Mot de passe" />
										</div>
									</div>

									<div class="form-group">
										<div class="col-md-offset-0 col-md-8">
											<s:submit value="CONNEXION" class="btn btn-success btn btn-success" />
										</div>
									</div>
								</div>
							</s:form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
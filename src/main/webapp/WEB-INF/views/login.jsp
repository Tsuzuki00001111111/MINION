<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
<link href="css/commons.css" rel="stylesheet">
</head>
<body>
	<c:if test="${not empty errmsg}">
		<p class="error">${fn:escapeXml(errmsg)}</p>
	</c:if>

	<form:form action="login" modelAttribute="LoginForm">
		<fieldset>
			<div>
				<label>ID</label>
				<form:input path="idVal" />
			</div>
			<div>
				<label>PASS</label>
				<form:password path="passVal" />
			</div>
		</fieldset>
		<input type="submit" value="ログイン">
	</form:form>
	<div>
		<a href="index">TOP画面に戻る</a>
	</div>
</body>
</html>

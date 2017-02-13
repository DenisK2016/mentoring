<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Title</title>
</head>
<body>

	<table border="2">
		<thead>
			<tr>
				<th>Name</th>
				<th>Width</th>
				<th>Length</th>
				<th>Height</th>
				<th>Length of circle</th>
				<th>Volume</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${allFigures}" var="figure">
				<tr>
					<td>${figure.name }</td>
					<td>${figure.dimensions.length }</td>
					<td>${figure.dimensions.width }</td>
					<td>${figure.dimensions.height }</td>
					<td>${figure.dimensions.lengthOfCircle }</td>
					<td><c:choose>
							<c:when test="${figure.dimensions.volume == null}"></c:when>
							<c:when test="${figure.dimensions.volume != -1}">
       ${figure.dimensions.volume }
    </c:when>
							<c:otherwise>
							Unknown figure
							</c:otherwise>
						</c:choose></td>
					<td><a href="delete/${figure.id}"><input type="submit"
							value="Delete" /></a><a href="volume/${figure.id}"><input
							type="submit" value="Volume" /></a></td>
				</tr>
			</c:forEach>
			<form:form method="post" action="add" commandName="figure">
				<tr>
					<td><form:input path="name" placeholder="Write here" /></td>
					<td><form:input path="dimensions.length"
							placeholder="Write here" /></td>
					<td><form:input path="dimensions.width"
							placeholder="Write here" /></td>
					<td><form:input path="dimensions.height"
							placeholder="Write here" /></td>
					<td><form:input path="dimensions.lengthOfCircle"
							placeholder="Write here" /></td>
					<td></td>
					<td><input type="submit" value="Add new figure" /></td>
				</tr>
			</form:form>
		</tbody>
	</table>
</body>
</html>
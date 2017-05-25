
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

Error: <br>
<c:forEach var="exception" items="${requestScope.exception.stackTrace }" >
	${exception }<br>
</c:forEach>

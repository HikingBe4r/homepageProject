<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script></script>

<c:if test="${empty sessionScope.member}">
	<c:redirect context="${pageContext.request.contextPath }" url="/loginForm.do"></c:redirect>
</c:if>

<c:if test="${!empty sessionScope.member }">
	${sessionScope.member.name } 님이 로그인하셨습니다. <br>
	<a href="${pageContext.request.contextPath }/logout.do">로그아웃</a>
	<a href="${pageContext.request.contextPath }/memberModForm.do">정보 수정</a> <br>	
</c:if>

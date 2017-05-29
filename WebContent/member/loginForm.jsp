<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/member/member.js?version=170529"></script>

<c:if test="${empty sessionScope.member}">
	<form name="loginForm" id="loginForm">
		<table border="1">
			<caption>로그인</caption>
			<tr>
				<td><label>아이디</label></td>
				<td><input type="text" name="userId" id="userId" /></td>
			</tr>
			<tr>
				<td><label>비밀번호</label></td>
				<td><input type="password" name="userPwd" id="userPwd" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="button" id="loginBtn">로그인</button>
					<button type="button" id="resetBtn">리셋</button>
					<button type="button" id="joinBtn">회원가입</button>
				</td>
			</tr>
		</table>
	</form>
</c:if>

<c:if test="${!empty sessionScope.member}">
	<c:redirect url="/main.jsp"></c:redirect>
</c:if>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="/HPwebproject/member/member.js?version=170526"></script>

<c:if test="${empty sessionScope.member }">
	<c:redirect url="/loginForm.do"></c:redirect>
</c:if>

<c:if test="${!empty sessionScope.member }">
	<form name="modForm" id="modForm">
		<input type="hidden" name="userNo" id="userNo" value="${sessionScope.member.no }"/> 
		<table border="1">
			<caption>회원정보 수정</caption>
			
			<tr>
				<td><label>이메일</label></td>
				<td><input type="text" name="userEmail" id="userEmail"
					readonly="readonly" value="${sessionScope.member.email }" /></td>
			</tr>
			<tr>
				<td><label>비밀번호</label></td>
				<td><input type="password" name="userPwd" id="userPwd" required="required"/></td>
			</tr>
			<tr>
				<td><label>새로운 비밀번호</label></td>
				<td><input type="password" name="newUserPwd" id="newUserPwd" /></td>
			</tr>
			<tr>
				<td><label>새로운 비밀번호 확인</label></td>
				<td><input type="password" name="newUserPwdConfirm"
					id="newUserPwdConfirm" /></td>
			</tr>
			<tr>
				<td><label>이름</label></td>
				<td><input type="text" name="userName" id="userName"
					value="${sessionScope.member.name }" /><button >중복확인(보류)</button></td>
			</tr>
			<tr>
				<td><label>가입일</label></td>
				<td><input type="text" name="userName" id="userName"
					readonly="readonly" value="${sessionScope.member.joinday }" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit" id="modBtn">수정</button>
					<button type="button" id="backBtn">뒤로가기</button>
				</td>
			</tr>
		</table>
	</form>
</c:if>
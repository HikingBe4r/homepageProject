<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script type="text/javascript" src="/HPwebproject/member/member.js"></script>

<form name="joinForm" id="joinForm">
	<table border="1">
		<caption>회원가입</caption>
		<tr>
			<td><label>아이디</label></td>
			<td><input type="text" name="userId" id="userId" /></td>
		</tr>
		<tr>
			<td><label>비밀번호</label></td>
			<td><input type="password" name="userPwd" id="userPwd" /></td>
		</tr>
		<tr>
			<td><label>비밀번호 확인</label></td>
			<td><input type="password" name="userPwdConfirm"
				id="userPwdConfirm" /></td>
		</tr>
		<tr>
			<td><label>이름</label></td>
			<td><input type="text" name="userName" id="userName" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<button type="button" id="addBtn">회원가입</button>
				<button type="button" id="resetBtn2">리셋</button>
				<button type="button" id="backBtn">뒤로가기</button>
			</td>
		</tr>
	</table>
</form>
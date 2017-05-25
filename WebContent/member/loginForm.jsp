<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript" src="/HPwebproject/member/member.js" ></script>


<form name="loginForm" id="loginForm">
	<table border="1">
		<caption>로그인</caption>
		<tr>
			<td><label>아이디</label></td>
			<td><input type="text" name="userId" id="userId"/></td>
		</tr>
		<tr>
			<td><label>비밀번호</label></td>
			<td><input type="password" name="userPwd" id="userPwd"/></td>
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

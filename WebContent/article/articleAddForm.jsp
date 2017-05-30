<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
<script>
	function getContextPath() {
		var offset = location.href.indexOf(location.host)
				+ location.host.length;
		var ctxPath = location.href.substring(offset, location.href.indexOf(
				'/', offset + 1));
		return ctxPath;
	}

	$(document).ready(function() {
		$("#articleAddForm").on("click", ":button", function() {
			var form = $("#articleAddForm");
			if ($(this).text() == "글쓰기") {
				form.attr("action", getContextPath() + "/articleAdd.do");
				form.submit();
			} else if ($(this).text() == "리셋") {
				form.each(function() {
					this.reset();
				});
			} else if ($(this).text() == "뒤로가기") {
				history.back();
			}
		});
	});
</script>


<c:if test="${empty sessionScope.member }">
	<c:redirect context="${pageContext.request.contextPath }"
		url="/loginForm.do"></c:redirect>
</c:if>

<c:if test="${!empty sessionScope.member }">
	<form name="articleAddForm" id="articleAddForm">
		<input type="hidden" id="userNo" value="${sessionScope.member.no }">
		<table border="1">
			<caption>글쓰기</caption>
			<tr>
				<td><label>제목</label></td>
				<td><input type="text" name="subject" id="subject" /></td>
			</tr>
			<tr>
				<td><label>글쓴이</label></td>
				<td><input type="text" name="writer" id="writer"
					readonly="readonly" value="${sessionScope.member.name }"/></td>
			</tr>
			<tr>
				<td><label>내용</label></td>
				<td><textArea name="content" id="content"></textArea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="button" id="addBtn">글쓰기</button>
					<button type="button" id="resetBtn2">리셋</button>
					<button type="button" id="backBtn">뒤로가기</button>
				</td>
			</tr>
		</table>
	</form>
</c:if>
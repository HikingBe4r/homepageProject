/**
 * 
 */

window.onload = function() {
	var loginBtn = document.getElementById("loginBtn");
	if (loginBtn != null) {
		loginBtn.addEventListener("click", function() {
			var form = document.loginForm;
			form.action = "../login.do";
			form.method = "get";
			form.submit();
		});
	}
	var resetBtn = document.getElementById("resetBtn");
	if (resetBtn != null) {
		resetBtn.addEventListener("click", function() {
			var form = document.loginForm;
			form.reset();
		});
	}

	var joinBtn = document.getElementById("joinBtn");
	if (joinBtn != null) {
		joinBtn.addEventListener("click", function() {
			var form = document.loginForm;
			form.action = "../joinForm.do";
			form.method = "get";
			form.submit();
		});
	}

	var addBtn = document.getElementById("addBtn"); // 회원등록버튼
	if (addBtn != null) {
		addBtn.addEventListener("click", function() {
			var form = document.joinForm;
			form.action = "../join.do";
			form.method = "post";
			form.submit();
		});
	}
	var resetBtn2 = document.getElementById("resetBtn2");
	if (resetBtn2 != null) {
		resetBtn2.addEventListener("click", function() {
			var form = document.joinForm;
			form.reset();
		});
	}
	var backBtn = document.getElementById("backBtn");
	if (backBtn != null) {
		backBtn.addEventListener("click", function() {
			var form = document.joinForm;
			history.back();
		});
	}
}
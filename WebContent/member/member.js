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
			history.back();
		});
	}
	
	var modBtn = document.getElementById("modBtn");
	if (modBtn != null) {
		modBtn.addEventListener("click", function() {
			var form = document.modForm;
			//modBtn.setAttribute("type", "submit");	// 나중에 쓸모있을수 있으니 알아둬.
			form.action="../memberMod.do";	
			form.method="get";
			//form.submit();		// 이렇게 해버리니까 input의 required 부분이 채워지지 않아도 전송되는 일이 있어서.
									// 변경함.
		});
	}
}
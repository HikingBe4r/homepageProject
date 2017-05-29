/**
 * member폴더의 jsp에서 쓰이는 js
 */

window.onload = function() {
	function getContextPath() {
		var offset = location.href.indexOf(location.host)
				+ location.host.length;
		var ctxPath = location.href.substring(offset, location.href.indexOf(
				'/', offset + 1));
		return ctxPath;
	}

	var loginBtn = document.getElementById("loginBtn");
	if (loginBtn != null) {
		loginBtn.addEventListener("click", function() {
			var form = document.loginForm;
			form.action = getContextPath() + "/login.do"; // 이부분 다 바꿔야해
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
			form.action = getContextPath() + "/joinForm.do";
			form.method = "get";
			form.submit();
		});
	}

	var addBtn = document.getElementById("addBtn"); // 회원등록버튼
	if (addBtn != null) {
		addBtn.addEventListener("click", function() {
			var form = document.joinForm;
			form.action = getContextPath() + "/join.do";
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

	/*
	 * var modBtn = document.getElementById("modBtn"); if (modBtn != null) {
	 * modBtn.addEventListener("click", function() { var form =
	 * document.modForm; //modBtn.setAttribute("type", "submit"); // 나중에 쓸모있을수
	 * 있으니 알아둬. form.action="../memberMod.do"; form.method="get";
	 * //form.submit(); // 이렇게 해버리니까 input의 required 부분이 채워지지 않아도 전송되는 일이 있어서. //
	 * 변경함. }); }
	 */
}
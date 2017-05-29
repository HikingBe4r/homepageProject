

$(document).ready(function() {
	function getContextPath(){
	    var offset=location.href.indexOf(location.host)+location.host.length;
	    var ctxPath=location.href.substring(offset,location.href.indexOf('/',offset+1));
	    return ctxPath;
	}

	var modBtn = $("#modBtn");
	modBtn.click(function() {
		// 버튼을 누르면, 비밀번호칸이 비어있는지 체크
		if($("#userPwd").val() == "") {
			// 비어있으면 alert발생
			alert("비밀번호를 입력하세요.");
		} else {
			// 비어있지 않으면 일단 memberMod.do로 넘기고
			// memberMod.do에서 맞는지 아닌지 체크.
			var form = document.modForm;
			//form.setAttribute("action", getContextPath()+ "/memberMod.do");
			form.action = getContextPath()+ "/memberMod.do";
			form.method = "post";
			form.submit();
		}
	});
	
	
/*	
	var userPwd = document.getElementById("userPwd");
	
	var modBtn = document.getElementById("modBtn");
	$(modBtn).click(function() {
		var newUserPwd = document.getElementById("newUserPwd");
		var newUserPwdConfirm = document.getElementById("newUserPwdConfirm");

		// 비밀번호를 입력받은지 먼저 체크
		if ($(userPwd).val() == "") {
			alert("비밀번호를 입력하세요.");

		}
		// 입력받은 비밀번호와 session의 member.pwd 일치확인 ---->>> 이거 완전 좋지 않은거니까 dao에서 처리할수있게 변경. 즉 session의 member에는 pwd값이 있으면 안됨.
		// 일치하지 않으면
		//else if ($(userPwd).val() != "test") {// memberPwd){
		//	alert("비밀번호가 틀렸습니다.");
		//}
		// 일치하면
		else 
			// 1. newUserPwd가 있는지 -> 있으면 confirm이랑 같으면 일치 font, event=1,
			// 안같으면 다시 확인하세요 font
			// 이건 인터넷에 나와있는걸로 다시 해보자. google-> '비밀번호 일치 확인' 검색
			if ($(newUserPwd).val() != "" && $(newUserPwdConfirm).val() != "") {
				if ($(newUserPwd).val() == $(newUserPwdConfirm).val()) {

					// member.setPwd();
					var form = document.modForm;
					// modBtn.setAttribute("type", "submit"); // 나중에 쓸모있을수 있으니
					// 알아둬.
					form.action = getContextPath() + "/memberMod.do?event=1";
					form.method = "post"
					form.submit();

				} else {
					alert("변경 비밀번호를 다시 확인하세요.");
				}
			}
			// 2. newUserPwd가 없으면 -> 다른것들만 수정, event=0
			else if($(newUserPwd).val() == ""){
				var form = document.modForm;
				form.action = getContextPath() + "/memberMod.do?event=0";
				form.method = "post"
				form.submit();
			}
		
	});
	*/
});
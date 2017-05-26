package controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;
import controller.Command;

public class MemberModAction implements Command{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		ActionForward forward = new ActionForward();
		
		int no = Integer.parseInt(request.getParameter("userNo"));
		String pwd = request.getParameter("userPwd");
		
		String newPwd = request.getParameter("newUserPwd");
		
		// 비밀번호 일치여부 체크 일치하면 회원정보 수정하고, 일치하지 않으면 다시 수정폼으로 돌려보냄.
		//if(password.equals()) {
			// newPwd가 null(or "")이 아니고, newPwdConfirm과 같으면 MemberVO.setPwd(newPwd);
		
			// service.modifyMember(member);
			
		//}
		
		return forward;
	}
}

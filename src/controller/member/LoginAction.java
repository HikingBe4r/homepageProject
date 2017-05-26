package controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.MemberVO;
import controller.ActionForward;
import controller.Command;

public class LoginAction implements Command{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String email = request.getParameter("userEmail");
		String pwd = request.getParameter("userPwd");
		ActionForward forward = new ActionForward();
		MemberVO member = new MemberVO();
		//MemberVO member = service.loginMember();		// service.loginMember(id,pwd) 가 MemberVO를 return 모든 정보가 있어야돼.
		//if(member.getNO != null) {
			// 로그인 성공하면 게시판 목록조회
			HttpSession session = request.getSession();
			member.setName("음음");
			session.setAttribute("member", member);	//session 영역에 로그인한 member객체 저장.
		
			forward.setPath("/boardList.do");	
			forward.setRedirect(true);
			return forward;
		//} else {
			//forward.setPath("/loginForm.do");	
			//forward.setRedirect(false);
			//return forward;
		//}
	}

}

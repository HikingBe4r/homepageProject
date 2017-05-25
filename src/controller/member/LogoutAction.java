package controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.ActionForward;
import controller.Command;

public class LogoutAction implements Command{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		ActionForward forward = new ActionForward();
		
		HttpSession session = request.getSession();
		
		// 세션에 있는거 다 지우는거. 로그인한 회원정보만 있으면 상관없긴 한데.. 세션에 다른거 있을경우엔 수정해야함.
		session.invalidate();	
		
		forward.setPath("/loginForm.do");
		forward.setRedirect(true);
		return forward;
	}
}

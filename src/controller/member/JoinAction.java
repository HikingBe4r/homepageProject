package controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.MemberVO;
import controller.ActionForward;
import controller.Command;

public class JoinAction implements Command{
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		ActionForward forward = new ActionForward();
		
		String email = request.getParameter("userEmail");
		String pwd = request.getParameter("userPwd");
		String pwdConfirm = request.getParameter("userPwdConfirm");
		String name = request.getParameter("userName");
		
		System.out.println("email: "+email);
		System.out.println("pwd: "+pwd);
		System.out.println("pwdConfirm: "+pwdConfirm);
		System.out.println("name: "+name);
		
		if(pwd.equals(pwdConfirm)) {
			MemberVO member = new MemberVO();
			member.setEmail(email);
			member.setPwd(pwd);
			member.setName(name);

			// service.insertMember();
			
			forward.setPath("/loginForm.do");
			forward.setRedirect(true);
			return forward;
		} else {
			forward.setPath("/joinForm.do");
			forward.setRedirect(false);
			return forward;
		}
	}
}

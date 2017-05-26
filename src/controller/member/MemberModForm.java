package controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;
import controller.Command;

public class MemberModForm implements Command{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		ActionForward forward = new ActionForward();
		
		forward.setPath("/member/memberModForm.jsp");
		forward.setRedirect(true);
		return forward;
	}

}

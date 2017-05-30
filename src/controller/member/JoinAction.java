package controller.member;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.MemberDAO;
import bean.MemberVO;
import conn.DBConn;
import controller.ActionForward;
import controller.Command;

public class JoinAction implements Command {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		ActionForward forward = new ActionForward();

		String email = request.getParameter("userEmail");
		String pwd = request.getParameter("userPwd");
		String name = request.getParameter("userName");

		Connection conn = null;
		try {
			conn = DBConn.getConnection();
			// 여기서 할일은 insert시키는거.
			MemberVO member = new MemberVO();
			member.setEmail(email);
			member.setPwd(pwd);
			member.setName(name);
			
			MemberDAO dao = MemberDAO.getInstance();
			dao.insertMember(conn, member);
			// service.insertMember();
			
			forward.setPath("/loginForm.do");
			forward.setRedirect(true);
			return forward;

		} catch (Exception e) {
			request.setAttribute("exception", e);
			forward.setPath("/error/error.jsp");
			forward.setRedirect(true);
			return forward;
		}
	}
}

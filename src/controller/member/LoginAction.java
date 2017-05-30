package controller.member;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.MemberDAO;
import bean.MemberVO;
import conn.DBConn;
import controller.ActionForward;
import controller.Command;

public class LoginAction implements Command {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String email = request.getParameter("userEmail");
		String pwd = request.getParameter("userPwd");
		ActionForward forward = new ActionForward();
		MemberVO member = new MemberVO();
		MemberDAO dao = MemberDAO.getInstance();

		Connection conn = null;
		try {
			conn = DBConn.getConnection();
			// MemberVO member = service.loginMember(); //
			// service.loginMember(id,pwd) 가 MemberVO를 return 모든 정보가 있어야돼.
			// if(member.getNO != null) {
			// 로그인 성공하면 게시판 목록조회
			
			
			HttpSession session = request.getSession();
			member.setEmail(email);
			member.setPwd(pwd);

			int no = dao.loginMember(conn, member);
			if (no == -1) {
				// 로그인 실패
				forward.setPath("/loginForm.do");
				forward.setRedirect(false);
				return forward;
			} else {
				// 로그인 성공
				session.setAttribute("member", dao.retrieveMember(conn, no)); // session 영역에 로그인한  member객체 저장.

				forward.setPath("/main.jsp");
				forward.setRedirect(true);
				return forward;
			}
		} catch (Exception e) {
			request.setAttribute("exception", e);
			forward.setPath("/error/error.jsp");
			forward.setRedirect(false);
			return forward;
		} finally {
			try {

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}

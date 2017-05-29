package controller.member;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBConn.DBConn;
import bean.MemberDAO;
import bean.MemberVO;
import controller.ActionForward;
import controller.Command;

public class MemberModAction implements Command {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		ActionForward forward = new ActionForward();

		int no = Integer.parseInt(request.getParameter("userNo"));
		String pwd = request.getParameter("userPwd");	// 입력받은 비밀번호
		String name = request.getParameter("userName");

		MemberVO member = new MemberVO();
		MemberDAO dao = MemberDAO.getInstance();
		Connection conn = null;	//	이건 서비스로 넘길거니까 임시.
		
		
		try {
			conn = DBConn.getConnection();
			// 1. 넘어온 비밀번호 일치 여부 확인
			if (pwd.equals(dao.retrieveMember(conn, no).getPwd())) {
				// 2. 일치하면 정보를 수정하고(DAO.modMember) main.jsp로 보냄.?
				member.setName(name);
				member.setNo(no);
				
				
				
			}
			// 3. 일치하지 않으면 다시 돌려보냄 -> memberModForm.do
			else {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		

		return forward;
	}
}

package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberDAO {
	private static MemberDAO instance = new MemberDAO();
	private MemberDAO() {}
	
	public static MemberDAO getInstance() {
		return instance;		
	}
	public int loginMember(Connection conn, MemberVO member) throws SQLException {
		// member 에는 id, pwd가 있다.
		// select로 id, pwd가 일치하는 member를 select하고, 존재하면 MemberVO를 반환.
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int no = -1;
		try {
			System.out.println(member);
			
			StringBuilder sql = new StringBuilder();
			sql.append("select member_no ");
			sql.append("from member ");
			sql.append("where member_email = ? and member_pwd = ? ");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, member.getEmail());
			pstmt.setString(2, member.getPwd());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				no = rs.getInt(1);
			}
			System.out.println("no: "+no);
			return no;
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
		}
	}
	
	public boolean insertMember(Connection conn, MemberVO member) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			System.out.println("member: "+member);
			
			StringBuilder sql = new StringBuilder();
			sql.append("insert into member ");
			sql.append("values(member_seq.nextval, ?, ?, ?, sysdate, 0)");

			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, member.getEmail());
			pstmt.setString(2, member.getPwd());
			pstmt.setString(3, member.getName());
			
			pstmt.executeUpdate();
			return true;
		} finally {
			if(pstmt!=null) pstmt.close();
		}
	}
	
	public MemberVO retrieveMember(Connection conn, int no) throws SQLException{
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			StringBuilder sql = new StringBuilder();
			sql.append("select MEMBER_EMAIL, member_pwd, member_name, member_joinday, authority	");
			sql.append("from member ");
			sql.append("where MEMBER_NO = ?");
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, no);
			
			rs = pstmt.executeQuery();
			
			MemberVO member = new MemberVO();
			
			if(rs.next()) {	
				member.setNo(no);
				member.setEmail(rs.getString(1));
				member.setPwd(rs.getString(2));
				member.setName(rs.getString(3));
				member.setJoinday(rs.getString(4));
				member.setAuthority(rs.getInt(5));
			}
			return member;	
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
		}
	}
	
	public void modifyMember(Connection conn, MemberVO member) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int no = member.getNo();
		String name = member.getName();
		try {
			
			StringBuilder sql = new StringBuilder();
			sql.append("update member ");
			sql.append("set member_name = ? ");
			sql.append("where id = "+no);
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, name);
			
			pstmt.executeUpdate();
			
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
		}	
	}
}

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
	
	public MemberVO retrieveMember(Connection conn, int no) throws SQLException{
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			StringBuilder sql = new StringBuilder();
			sql.append("select member_id, member_pwd, member_name, member_joinday, authority	");
			sql.append("from member ");
			sql.append("where member_no = "+no);
			
			rs = stmt.executeQuery(sql.toString());
			
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
			if(stmt != null) stmt.close();
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

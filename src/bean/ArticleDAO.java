package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ArticleDAO {
	private static ArticleDAO instance = new ArticleDAO();
	private ArticleDAO() {}
	public static ArticleDAO getInstance() {
		return instance;
	}
	
	public void insertArticle(Connection conn, ArticleVO article) throws Exception {
		PreparedStatement pstmt = null;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("insert into article   ");
			sql.append("values (article_seq.nextval, ?, ?, sysdate, 0, ?) "); 

			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, article.getSubject());
			pstmt.setString(2, article.getContent());
			pstmt.setInt(3, article.getBoard_no());
			
			pstmt.executeUpdate();
		} finally {
			if(pstmt!=null) pstmt.close();	
		}
	}
	
	public void modifyArticle(Connection conn, ArticleVO article) throws Exception {
		
	}
	public void deleteArticle(Connection conn, int articleNo) throws Exception {
		
	}
	public void retrieveArticleList(Connection conn, int boardNo) throws Exception {
		
	}
	public void retrieveArticle(Connection conn, ArticleVO article) throws Exception {
		
	}

	
}

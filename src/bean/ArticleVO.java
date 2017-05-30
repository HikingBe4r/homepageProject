package bean;

public class ArticleVO {
	private int no;
	private String subject;
	private String content;
	private String writeday;
	private int hitcount;
	private int board_no;
	public ArticleVO() {
		super();
	}
	public ArticleVO(int no, String subject, String content, String writeday, int hitcount, int board_no) {
		super();
		this.no = no;
		this.subject = subject;
		this.content = content;
		this.writeday = writeday;
		this.hitcount = hitcount;
		this.board_no = board_no;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriteday() {
		return writeday;
	}
	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}
	public int getHitcount() {
		return hitcount;
	}
	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	@Override
	public String toString() {
		return "ArticleVO [no=" + no + ", subject=" + subject + ", content=" + content + ", writeday=" + writeday
				+ ", hitcount=" + hitcount + ", board_no=" + board_no + "]";
	}
	
	
}

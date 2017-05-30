package controller;


import java.util.HashMap;
import java.util.Map;

//클라이언트 요청이 왔을때 인스턴스를 생성하여 바인드 시키는 클래스
public class CommandFactory {
	//싱글톤 패턴 - 하나의 인스턴스만 생성
	private static CommandFactory instance = new CommandFactory();
	private Map<String, String> commandMap = new HashMap<String, String>();
	
	private CommandFactory() {
		
		// member
		commandMap.put("/loginForm.do", "controller.member.LoginForm");	// 로그인 폼 페이지
		commandMap.put("/login.do", "controller.member.LoginAction");	// 로그인 처리 페이지
		commandMap.put("/joinForm.do", "controller.member.JoinForm");	// 회원가입 폼 페이지
		commandMap.put("/join.do", "controller.member.JoinAction");	// 회원가입 처리 페이지
		commandMap.put("/logout.do", "controller.member.LogoutAction");	// 회원가입 처리 페이지
		commandMap.put("/memberModForm.do", "controller.member.MemberModForm");	// 회원가입 처리 페이지
		commandMap.put("/memberMod.do", "controller.member.MemberModAction");	// 회원가입 처리 페이지
		
		// board
		commandMap.put("/boardList.do", "controller.board.BoardListAction");	// 회원가입 처리 페이지
		
		// article
		commandMap.put("articleAddForm.do", "controller.article.ArticleAddForm");	//게시글 추가 폼을 보여주는 클래스
		commandMap.put("articleAdd.do", "controller.article.ArticleAddAction");		// 게시글 추가 처리하는 클래스
		commandMap.put("articleModForm.do", "controller.article.ArticleModForm");	// 게시글 수정 폼을 보여주는 클래스
		commandMap.put("articleMod.do", "controller.article.ArticleModAction");		// 게시글 수정 처리하는 클래스
		commandMap.put("articleList.do", "controller.article.ArticleListAction");	// 게시글 목록 처리하는 클래스
		commandMap.put("articleDelForm.do", "controller.article.ArticleDelForm");	// 게시글 삭제 폼을 보여주는 클래스
		commandMap.put("articleDel.do", "controller.article.ArticleDelAction");		// 게시글 삭제 처리하는 클래스
		commandMap.put("articleDetail.do", "controller.article.ArticleDetailAction");	// 게시글 상세조회 처리하는 클래스

	}
	
	public static CommandFactory getInstance(){
		return instance;
	}
	
	public Command createCommand(String uri){
		String className = commandMap.get(uri);
		if(className == null){
			return null;
		}
		try {
			Class commandClass = Class.forName(className);//인스턴스 생성 코드
			Command command = (Command)commandClass.newInstance();//인스턴스 생성 코드
			return command;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
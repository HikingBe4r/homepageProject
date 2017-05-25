package controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	//클라이언트 요청이 왔을때 처리하는 메소드
	ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException;
}

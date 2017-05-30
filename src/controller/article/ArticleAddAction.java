package controller.article;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;
import controller.Command;

public class ArticleAddAction implements Command{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		ActionForward forward = new ActionForward();
		
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		
		forward.setPath("/article/articleAddForm.jsp");
		forward.setRedirect(true);
		return forward;
	}
}

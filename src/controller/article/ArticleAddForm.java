package controller.article;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ActionForward;
import controller.Command;

public class ArticleAddForm implements Command {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		ActionForward forward = new ActionForward();
		
		forward.setPath("/article/articleAddForm.jsp");
		forward.setRedirect(true);
		return forward;
	}
}

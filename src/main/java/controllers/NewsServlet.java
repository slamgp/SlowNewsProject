package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.NewsCreator;
import model.Article;

@WebServlet("/news")
public class NewsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//List<Article> news = createTestDate();
		List<Article> news = createTestDateRSS();
		req.setAttribute("news", news);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/news.jsp");
		dispatcher.forward(req,resp); 
	}

	private List<Article>  createTestDate() {
		NewsCreator newsCreator = new NewsCreator();
		return newsCreator.createTestDate();
	}

	private List<Article>  createTestDateRSS() {
		NewsCreator newsCreator = new NewsCreator();
		return newsCreator.createRSSDate();
	}
}

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

import model.Article;

@WebServlet("/news")
public class NewsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		List<Article> news = new ArrayList<Article>();
		req.setAttribute("news", news);
		createTestDate(news);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/view/news.jsp");
		dispatcher.forward(req,resp); 
	}

	private void createTestDate(List<Article> news) {
		news.add(new Article("images/346257.jpg", "������ ������ � ����� ������� � ������ � ����", 
				"	���� ������ ������ ������� � ���� ����������� ������� ������ �����, "
				+ " �� ���� � ����� ���������� ��� ����� �������� ����� � �������� ������ - ��� ��� ������ ��������."
				+ " � ��������� ������ �������� ��������� ����� �������� ����, � � �������, ��� ��� ������� � ������."
				+ " ��� �������� �������� � �������� ������ �������������. ������ ������ �������� � ������. �����, � ������ �� ���� ������� ����������"
				+ ", - �������� ����� ������ ����� The Telegraph."
				+ " �� ������ ������� ���������� ����� ��������� �������� ����������,"
                + " ������ ��� �� ����� ���� ����� ����� ����, ������� �� �������� ��� ���������� - HBOm Sky � RTL."
	            + " ��������, ��� � ������ 2015-���� ����� ������� ������ �������� ������, ������� � �������� ����� WBO,"
	            + " IBF, WBA � IBO � ������������ ����."));
		news.add(new Article("images/346300.jpg", "�������: ���� ����� ������� ��� �����", 
				"��� ������� �� ��� ����� � ������� ��������� ������. � ������, ��� ���� ����� �������... "
				+ "������, � �����, ��� �� ������� ��� ��������, �� ������� �������� �����, ��� � �����������."
				+ " � ���, ��� ���� �������, ��� ��� ��� ��� ���� ��� �� ���� ����� ��� � ��� ���� ������ � ���. "
				+ "������ ��� ���������� �������� ���� ��������� ���, � ������ �������. "
                + " � �������, ��� ����������� ����� �� ����� ����� ������ ���� �����, ��� ��� � ���� ������ ����� ����� ��� �� ������������. "
                + " �� ��� �� ����� ������. � ���� ���������� �������������, "
                + " ����� �������� ��� �����, � ��������� ������� ���� �� ������� WBA (Super)/WBO (Super)/IBF � ����������� ����."  
                + " ��������, ��� ������� ���-������� ���� �� ������ ������� ���� ����� ���� ������� ������ ��� �������� ���������� ��������."));
		news.add(new Article("images/346289.jpg", "���� �������� ������� �������", 
				"�� ������ ������ ���������� �������� �������� ��� ����� ������������� �����, "
				+ "� � ������� ������ �� � ����� �������� ������ ��������� � �������."
				+ "	�������, ��� � ������� ������ � ��������� ����� ���� ���� �� ��������� ������, � ������ �� ���� ���� �����."
				+ " � ����� ������ ��� ���� � ����� �����, ������� ��� �������� ������ ������ ����� �����: 117:108, 117:109 � 118:109."));
	}

}

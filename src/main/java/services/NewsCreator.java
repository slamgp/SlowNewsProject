package services;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.Article;
import model.rss.CNN;
import model.rss.Item;

public class NewsCreator {
	
	public List<Article> createTestDate() {
		List<Article> news = new ArrayList<Article>();
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
		return news;
	}
	
	public List <Article> createRSSDate() {
		List <Article>result = new ArrayList<Article>();
		try {
			System.out.println("start");
			URL snnUrl = new URL("http://rss.cnn.com/rss/edition.rss");
			JAXBContext jaxbContext = JAXBContext.newInstance(CNN.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			CNN cnn = (CNN) unmarshaller.unmarshal(snnUrl.openStream());
			System.out.println(cnn);
			System.out.println(cnn.getChannel());
			for(Item it: cnn.getChannel().getItem()) {
				if (!it.getDescription().isEmpty()) {
					result.add(new Article("images/346289.jpg", it.getTitle(), it.getDescription()));
				}
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}

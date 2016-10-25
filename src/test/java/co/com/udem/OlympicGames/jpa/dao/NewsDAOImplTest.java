package co.com.udem.OlympicGames.jpa.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.OlympicGames.jpa.entities.News;
import co.com.udem.OlympicGames.model.NewsDTO;

public class NewsDAOImplTest {

	@Test
	public void testFindNews() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

		List<News> newsList = new ArrayList<News>();
		NewsDAO newsDAO = (NewsDAO) context.getBean(NewsDAOImpl.class);
		newsList = newsDAO.findNews();
		for (News news : newsList) {
			System.out.println("title: " + news.getTitle());
		}
	}

	@Test
	public void findNewsDTO() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

		List<NewsDTO> newsList = new ArrayList<NewsDTO>();

		NewsDAO newsDAO = (NewsDAO) context.getBean(NewsDAOImpl.class);
		newsList = newsDAO.findNewsDTO();
		for (NewsDTO news : newsList) {
			System.out.println("title: " + news.getTitle());
		}
	}

}

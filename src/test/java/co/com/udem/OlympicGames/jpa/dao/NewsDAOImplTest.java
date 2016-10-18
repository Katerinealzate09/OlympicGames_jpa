package co.com.udem.OlympicGames.jpa.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.OlympicGames.jpa.entities.News;

public class NewsDAOImplTest {

	@Test
	public void testFindNews() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

		List<News>newsList = new ArrayList<News>();
		NewsDAO newsDAO = (NewsDAO) context.getBean(NewsDAOImpl.class);
		newsList = newsDAO.findNews();
		for (News news : newsList) {
			System.out.println("title: " + news.getTitle());
		}
	}

}

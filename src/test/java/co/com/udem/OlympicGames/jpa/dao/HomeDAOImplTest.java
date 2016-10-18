package co.com.udem.OlympicGames.jpa.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.OlympicGames.jpa.entities.Home;

public class HomeDAOImplTest {

	@Test
	public void testFindHome() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

		List<Home>homeList = new ArrayList<Home>();
		HomeDAO homeDAO = (HomeDAO) context.getBean(HomeDAOImpl.class);
		homeList = homeDAO.findHome();
		for(Home home : homeList){
			System.out.println("title: " + home.getTitle());
			
		}
	}

}

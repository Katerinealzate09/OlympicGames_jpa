package co.com.udem.OlympicGames.jpa.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.OlympicGames.jpa.entities.Home;
import co.com.udem.OlympicGames.model.HomeDTO;

public class HomeDAOImplTest {

	@Test
	public void testFindHome() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

		List<Home>homeList = new ArrayList<Home>();
		HomeDAO homeDAO = (HomeDAO) context.getBean(HomeDAOImpl.class);
		homeList = homeDAO.findHome();
		for(Home home : homeList){
			System.out.println("title: " + home.getTitle());
			
		}
	}
	
	@Test
	public void findHomeDTO() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

		List<HomeDTO> homeList = new ArrayList<HomeDTO>();
		
		HomeDAO homeDAO = (HomeDAO) context.getBean(HomeDAOImpl.class);
		homeList = homeDAO.findHomeDTO();
		for(HomeDTO home : homeList){
			System.out.println("Title: " + home.getTitle());
		}
	}

}

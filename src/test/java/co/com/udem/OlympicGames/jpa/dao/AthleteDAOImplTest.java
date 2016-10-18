package co.com.udem.OlympicGames.jpa.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.OlympicGames.jpa.entities.Athlete;

public class AthleteDAOImplTest {

	@Test
	public void testFindAthlete() {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		List<Athlete>athleteList = new ArrayList<Athlete>();
		AthleteDAO athleteDAO =(AthleteDAO) context.getBean(AthleteDAOImpl.class);
		athleteList = athleteDAO.findAthlete();
		for(Athlete athlete : athleteList){
			System.out.println("title: " +athlete.getName());
		}
	}

}

package co.com.udem.OlympicGames.jpa.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.OlympicGames.jpa.entities.Athlete;
import co.com.udem.OlympicGames.model.AthletesDTO;

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
	
	@Test
	public void findAthleteDTO(){
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

		List<AthletesDTO> athletesList = new ArrayList<AthletesDTO>();
		
		AthleteDAO athletesDAO = (AthleteDAO) context.getBean(AthleteDAOImpl.class);
		athletesList = athletesDAO.findAthleteDTO();
		for(AthletesDTO athletes : athletesList){
			System.out.println("title: " +athletes.getName());
		}
	}

}

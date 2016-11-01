package co.com.udem.OlympicGames.jpa.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.OlympicGames.jpa.entities.Medal;
import co.com.udem.OlympicGames.model.AthletesDTO;
import co.com.udem.OlympicGames.model.MedalDTO;

public class MedalDAOImplTest {

	@Test
	public void testFindMedal() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		List<Medal>athleteList = new ArrayList<Medal>();
		MedalDAO athleteDAO =(MedalDAO) context.getBean(MedalDAOImpl.class);
		athleteList = athleteDAO.findMedal();
		for(Medal athlete : athleteList){
			System.out.println("Title: " +athlete.getName());
		}
	}

	@Test
	public void testFindMedalDTO() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		List<MedalDTO>athleteList = new ArrayList<MedalDTO>();
		MedalDAO athleteDAO =(MedalDAO) context.getBean(MedalDAOImpl.class);
		athleteList = athleteDAO.findMedalDTO();
		for(MedalDTO athletes : athleteList){
			System.out.println("title: " +athletes.getName());
		}
	}

}

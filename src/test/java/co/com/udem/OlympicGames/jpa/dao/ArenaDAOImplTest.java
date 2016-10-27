package co.com.udem.OlympicGames.jpa.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.OlympicGames.jpa.entities.Arena;
import co.com.udem.OlympicGames.model.ArenasDTO;

public class ArenaDAOImplTest {

	@Test
	public void testFindArena() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		
		List<Arena> arenaList = new ArrayList<Arena>();
		ArenaDAO arenaDAO =(ArenaDAO)context.getBean(ArenaDAOImpl.class);
		arenaList = arenaDAO.findArena();
		for(Arena arena : arenaList){
			System.out.println("title: " + arena.getTitle());
		}
	}

	@Test
	public void testFindArenaDTO() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		
		List<ArenasDTO> arenaList = new ArrayList<ArenasDTO>();
		
		ArenaDAO arenaDAO =(ArenaDAO)context.getBean(ArenaDAOImpl.class);
		arenaList = arenaDAO.findArenaDTO();
		for(ArenasDTO arena : arenaList){
			System.out.println("title: " + arena.getTitle());
		}
	}

}

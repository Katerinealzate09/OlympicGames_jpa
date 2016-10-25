package co.com.udem.OlympicGames.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.com.udem.OlympicGames.jpa.entities.Home;
import co.com.udem.OlympicGames.model.HomeDTO;

@Repository
public class HomeDAOImpl implements HomeDAO{

	@PersistenceContext
	private EntityManager em = null;
	
	public Home findHome(int id) {
		return null;
	}

	public List<Home> findHome() {
		Query query = em.createQuery("SELECT n FROM Home n");
		return query.getResultList();
	}

	public List<HomeDTO> findHomeDTO() {
		Query query = em.createQuery("SELECT NEW co.com.udem.OlympicGames.model.HomeDTO(n.title, n.image, n.url) FROM Home n");
		return query.getResultList();
	}


}

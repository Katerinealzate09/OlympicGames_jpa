package co.com.udem.OlympicGames.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.com.udem.OlympicGames.jpa.entities.Arena;
import co.com.udem.OlympicGames.model.ArenasDTO;

@Repository
public class ArenaDAOImpl implements ArenaDAO{

	@PersistenceContext
	private EntityManager em = null;
	
	public Arena findArena(int id) {
		return null;
	}

	public List<Arena> findArena() {
		Query query = em.createQuery("SELECT n FROM Arena n");
		return query.getResultList();
	}

	public List<ArenasDTO> findArenaDTO() {
		Query query = em.createQuery("SELECT NEW co.com.udem.OlympicGames.model.ArenasDTO(n.title, n.image, n.url) FROM Arena n");
		return query.getResultList();
	}

}

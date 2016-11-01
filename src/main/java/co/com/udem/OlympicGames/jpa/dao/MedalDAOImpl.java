package co.com.udem.OlympicGames.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.com.udem.OlympicGames.jpa.entities.Medal;
import co.com.udem.OlympicGames.model.MedalDTO;

@Repository
public class MedalDAOImpl implements MedalDAO {

	@PersistenceContext
	private EntityManager em = null;
	
	public Medal findMedal(int id) {
		return null;
	}

	public List<Medal> findMedal() {
		Query query = em.createQuery("SELECT n FROM Medal n");
		return query.getResultList();
	}

	public List<MedalDTO> findMedalDTO() {
		Query query = em.createQuery("SELECT NEW co.com.udem.OlympicGames.model.MedalDTO(n.name, n.nationality, n.image, n.medal)FROM Medal n");
		return query.getResultList();
	}

}

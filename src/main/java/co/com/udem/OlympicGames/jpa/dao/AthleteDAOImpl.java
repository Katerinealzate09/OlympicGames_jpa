package co.com.udem.OlympicGames.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.com.udem.OlympicGames.jpa.entities.Athlete;
import co.com.udem.OlympicGames.model.AthletesDTO;

public class AthleteDAOImpl implements AthleteDAO{

	@PersistenceContext
	private EntityManager em = null;
	
	public Athlete findAthlete(int id) {
		return null;
	}

	public List<Athlete> findAthlete() {
		Query query = em.createQuery("SELECT n FROM Athlete n");
		return query.getResultList();
	}

	public List<AthletesDTO> findAthleteDTO() {
		Query query = em.createQuery("SELECT NEW co.com.udem.OlympicGames.model.AthletesDTO(n.image, n.name, n.sport, n.nationality)FROM Athlete n");
		return query.getResultList();
	}

}

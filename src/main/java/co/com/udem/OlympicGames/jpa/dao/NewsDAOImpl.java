package co.com.udem.OlympicGames.jpa.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.com.udem.OlympicGames.jpa.entities.News;
import co.com.udem.OlympicGames.model.NewsDTO;

@Repository
public class NewsDAOImpl implements NewsDAO{

	@PersistenceContext
	private EntityManager em = null;
	
	
	public News findNews(int id) {
		return null;
	}

	public List<News> findNews() {
		Query query = em.createQuery("SELECT n FROM News n");
		return query.getResultList();
	}

	public List<NewsDTO> findNewsDTO() {
		Query query = em.createQuery("SELECT NEW co.com.udem.OlympicGames.model.NewsDTO(n.title, n.description, n.image, n.newsUrl)FROM News n");
		return query.getResultList();
	}

}

package co.com.udem.OlympicGames.jpa.dao;

import java.util.List;

import co.com.udem.OlympicGames.jpa.entities.News;
import co.com.udem.OlympicGames.model.NewsDTO;

public interface NewsDAO {
	
	public News findNews(int id);
	public List<News>findNews();
	public List<NewsDTO>findNewsDTO();
}

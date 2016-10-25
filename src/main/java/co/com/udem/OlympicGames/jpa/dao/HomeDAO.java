package co.com.udem.OlympicGames.jpa.dao;

import java.util.List;

import co.com.udem.OlympicGames.jpa.entities.Home;
import co.com.udem.OlympicGames.model.HomeDTO;

public interface HomeDAO {
	
	public Home findHome(int id);
	public List<Home>findHome();
	public List<HomeDTO>findHomeDTO();
	

}

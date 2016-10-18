package co.com.udem.OlympicGames.jpa.dao;

import java.util.List;

import co.com.udem.OlympicGames.jpa.entities.Home;

public interface HomeDAO {
	
	public Home findHome(int id);
	public List<Home>findHome();
	

}

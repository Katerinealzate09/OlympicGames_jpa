package co.com.udem.OlympicGames.jpa.dao;

import java.util.List;

import co.com.udem.OlympicGames.jpa.entities.Arena;
import co.com.udem.OlympicGames.model.ArenasDTO;

public interface ArenaDAO {
	
	public Arena findArena(int id);
	public List<Arena>findArena();
	public List<ArenasDTO>findArenaDTO();

}

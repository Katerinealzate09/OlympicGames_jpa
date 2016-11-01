package co.com.udem.OlympicGames.jpa.dao;

import java.util.List;

import co.com.udem.OlympicGames.jpa.entities.Medal;
import co.com.udem.OlympicGames.model.MedalDTO;

public interface MedalDAO {

	public Medal findMedal(int id);

	public List<Medal> findMedal();

	public List<MedalDTO> findMedalDTO();

}

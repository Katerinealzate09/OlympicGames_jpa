package co.com.udem.OlympicGames.jpa.dao;

import java.util.List;

import co.com.udem.OlympicGames.jpa.entities.Athlete;
import co.com.udem.OlympicGames.model.AthletesDTO;

public interface AthleteDAO {

	public Athlete findAthlete(int id);

	public List<Athlete> findAthlete();

	public List<AthletesDTO> findAthleteDTO();
}

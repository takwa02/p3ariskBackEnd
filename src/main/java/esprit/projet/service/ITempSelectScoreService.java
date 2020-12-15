package esprit.projet.service;

import java.util.List;

import esprit.projet.persistance.model.CriteriaDef;
import esprit.projet.persistance.model.TempSelectScores;

public interface ITempSelectScoreService {
	
	public List<TempSelectScores> findAll();
	
	public List<TempSelectScores> findBymatricule(String ctrMatfis);

	

}

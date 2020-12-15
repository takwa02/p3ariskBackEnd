package esprit.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import esprit.projet.persistance.dao.P3aActiviRepository;
import esprit.projet.persistance.dao.TempSelectScoreRepository;
import esprit.projet.persistance.dao.TpCategoryRepository;
import esprit.projet.persistance.model.TempSelectScores;

@Service
@Transactional
public class TempSelectScoreService implements ITempSelectScoreService {
	@Autowired
	private TempSelectScoreRepository tempSelectScoreRepository;
	@Autowired
	private TpCategoryRepository tpCategoryRepository;
	@Override
	public List<TempSelectScores> findAll() {
		// TODO Auto-generated method stub
		//tpCategoryRepository.CallCalculate_Score(2014);
		
		return tempSelectScoreRepository.findAll();
	}

	@Override
	public List<TempSelectScores> findBymatricule(String ctrMatfis) {
		// TODO Auto-generated method stub
	//	tpCategoryRepository.CallCalculate_Score(2014);
		 List<TempSelectScores> l= tempSelectScoreRepository.findByCtrMatfis(ctrMatfis);
		 
		 
		  return l;
	}

}

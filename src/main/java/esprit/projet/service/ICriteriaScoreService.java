package esprit.projet.service;

import java.math.BigDecimal;
import java.util.List;

import esprit.projet.persistance.model.CriteriaScore;

public interface ICriteriaScoreService {

	List<CriteriaScore> findAll();

	void add(CriteriaScore criteriaScore);

	void update(CriteriaScore criteriaScore);

	void delete(CriteriaScore criteriaScore);

	CriteriaScore findOne(Integer id);
	
	List<CriteriaScore> findByCriteriaId(BigDecimal criteriaId);
}

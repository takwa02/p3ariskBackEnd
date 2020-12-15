package esprit.projet.service;

import java.math.BigDecimal;
import java.util.List;

import esprit.projet.persistance.model.P3aActivi;

public interface IP3aActiviService {

	List<P3aActivi> findAll();

	void add(P3aActivi P3aActivi);

	void update(P3aActivi P3aActivi);

	void delete(P3aActivi P3aActivi);

	
	List<P3aActivi> findByCriteriaId(BigDecimal criteriaId);

	P3aActivi findOne(String id);

}

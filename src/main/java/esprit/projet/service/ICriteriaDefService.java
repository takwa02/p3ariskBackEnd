package esprit.projet.service;

import java.util.List;

import esprit.projet.persistance.model.CriteriaDef;

public interface ICriteriaDefService {
	
	public List<CriteriaDef> findAll();
	
	public void add(CriteriaDef criteriaDef);

	public void update(CriteriaDef criteriaDef);

	public void delete(CriteriaDef criteriaDef);

	public CriteriaDef findOne(Integer id);

	public List<CriteriaDef> getAll();

}

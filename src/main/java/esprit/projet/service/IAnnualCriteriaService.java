package esprit.projet.service;

import java.math.BigDecimal;
import java.util.List;

import esprit.projet.persistance.model.AnnualCriteria;

public interface IAnnualCriteriaService {
	
	public List<AnnualCriteria> findAll();
	
	public void add(AnnualCriteria AnnualCriteria);

	public void update(AnnualCriteria AnnualCriteria);

	public void delete(AnnualCriteria AnnualCriteria);

	public AnnualCriteria findOne(Integer id);

	public List<AnnualCriteria> findByYearLocked(Boolean yearlocked);

	public List<AnnualCriteria> findByCriteriaYear(BigDecimal criteriayear);

	public List<AnnualCriteria> findByCriteriaId(BigDecimal criteriaId);

}

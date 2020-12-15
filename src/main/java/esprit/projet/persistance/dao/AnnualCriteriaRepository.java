package esprit.projet.persistance.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import esprit.projet.persistance.model.AnnualCriteria;
import esprit.projet.persistance.model.CriteriaDef;

import java.lang.Boolean;
import java.util.List;


public interface AnnualCriteriaRepository extends JpaRepository<AnnualCriteria, BigDecimal>{

List<AnnualCriteria> findByYearLocked(Boolean yearlocked);	
List<AnnualCriteria> findByCriteriaYear(BigDecimal criteriayear);
List<AnnualCriteria> findByCriteriaDef(CriteriaDef criteriaDef);

}

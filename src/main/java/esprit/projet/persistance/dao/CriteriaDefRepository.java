package esprit.projet.persistance.dao;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import esprit.projet.persistance.model.CriteriaDef;
import java.lang.String;
import java.util.List;

public interface CriteriaDefRepository extends JpaRepository<CriteriaDef, BigDecimal>{
	@Query(value="select * from Criteria_Def order By CRITERIA_ID" ,nativeQuery = true)
	public List<CriteriaDef> getAll();
	
}

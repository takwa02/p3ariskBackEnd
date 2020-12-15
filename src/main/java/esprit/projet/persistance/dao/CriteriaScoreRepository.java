package esprit.projet.persistance.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import esprit.projet.persistance.model.CriteriaDef;
import esprit.projet.persistance.model.CriteriaScore;

public interface CriteriaScoreRepository extends JpaRepository<CriteriaScore, BigDecimal>{
List<CriteriaScore> findByCriteriaDef(CriteriaDef criteriaDef);
}

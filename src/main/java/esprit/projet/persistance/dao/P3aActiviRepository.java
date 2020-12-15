package esprit.projet.persistance.dao;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import esprit.projet.persistance.model.P3aActivi;
import esprit.projet.persistance.model.P3aActiviId;

public interface P3aActiviRepository  extends JpaRepository<P3aActivi, String>{

	Optional<P3aActivi> findById(String bigDecimal);

	//List<P3aActivi> findByCriteriaDef(CriteriaDef criteriaDef);

}

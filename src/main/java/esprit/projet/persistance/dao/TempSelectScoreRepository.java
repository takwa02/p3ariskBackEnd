package esprit.projet.persistance.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import esprit.projet.persistance.model.TempSelectScores;
import java.lang.String;
import java.util.List;

public interface TempSelectScoreRepository extends JpaRepository<TempSelectScores, String>{
	@Query(value="select * from Temp_Select_Scores t where t.CTR_MATFIS= :ctrMatfis  order By CRITERIA_ID" ,nativeQuery = true)
	//List<TempSelectScores> findBymatricule(@Param("ctrMatfis") String ctrMatfis);
	List<TempSelectScores> findByCtrMatfis(String ctrMatfis);


}

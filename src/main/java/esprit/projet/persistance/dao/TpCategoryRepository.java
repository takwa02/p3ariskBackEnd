package esprit.projet.persistance.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import esprit.projet.persistance.model.Tpcategory;


@Repository
public interface TpCategoryRepository extends PagingAndSortingRepository<Tpcategory, String>{
	 Page<Tpcategory> findByActLibell(String actLibell, Pageable pageable);
	  
	 @Query(value = "select * from  Tpcategory t where  t.act_Libell= :actLibell", nativeQuery = true)
	List<Tpcategory> findByActLibell(String actLibell);

		
	  @Procedure(procedureName = "Calculate_Score")
	  void CallCalculate_Score(@Param("pCritYear") int pCritYear);
	  
	
}

package esprit.projet.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import esprit.projet.persistance.model.Tpcategory;

public interface ITpCategoryService {

	Page<Tpcategory> findAll(Pageable pageRequest);

	Page<Tpcategory> findByActLibell(String actLibell, Pageable pageable);


	/*void add(Tpcategory tpCategory);

	void update(Tpcategory tpCategory);

	void delete(Tpcategory tpCategory);

	Tpcategory findOne(Integer id);

	List<Tpcategory> findByCriteriaId(BigDecimal criteriaId);*/

}

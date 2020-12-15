package esprit.projet.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import esprit.projet.persistance.dao.TpCategoryRepository;
import esprit.projet.persistance.model.Tpcategory;

@Service
@Transactional
public class TpCategoryService implements ITpCategoryService {
	
	@Autowired
	private TpCategoryRepository tpCategoryRepository;
	@Override
	
	public Page<Tpcategory> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		
		System.out.println("fin execution proceudre");
		//Pageable pageable=PageRequest.of(2, 4,Sort.by("ctrMatfis").descending());
		Page<Tpcategory> listTpCategorys=tpCategoryRepository.findAll(pageable);
		if(listTpCategorys.isEmpty()) {
			tpCategoryRepository.CallCalculate_Score(2014);
			 listTpCategorys=tpCategoryRepository.findAll(pageable);
		}
		return listTpCategorys;
	}
	@Override
	public Page<Tpcategory> findByActLibell(String actLibell,Pageable pageable) {
		// TODO Auto-generated method stub
		//Pageable pageable=PageRequest.of(0, 2,Sort.by("ctrMatfis").descending());
		System.out.println("***Fin execution procedure***");

	 List<Tpcategory> listTpCategorys= tpCategoryRepository.findByActLibell(actLibell);
	 	listTpCategorys.stream().map(x->x.getCtrMatfis()).forEach(System.out::println);
		
		Page<Tpcategory> l=tpCategoryRepository.findByActLibell(actLibell,pageable);
	
				l.stream().map(x->x.getCtrMatfis()).forEach(System.out::println);
				
		System.out.println("========n=======>"+listTpCategorys.size());
		
		if(tpCategoryRepository.findAll(pageable).isEmpty()) {
			tpCategoryRepository.CallCalculate_Score(2014);
			 l=tpCategoryRepository.findByActLibell(actLibell,pageable);
		}
		return l;
		}
	

	/*
	 * @Override public void add(Tpcategory TpCategory) { // TODO Auto-generated
	 * method stub tpCategoryRepository.save(TpCategory); }
	 * 
	 * @Override public void update(Tpcategory TpCategory) { // TODO Auto-generated
	 * method stub tpCategoryRepository.save(TpCategory);
	 * 
	 * }
	 * 
	 * @Override public void delete(Tpcategory TpCategory) { // TODO Auto-generated
	 * method stub tpCategoryRepository.delete(TpCategory);
	 * 
	 * }
	 */

/*	@Override
	public Tpcategory findOne(Integer id) {
		// TODO Auto-generated method stub
		return 	null;//	tpCategoryRepository.findById(new BigDecimal(id)).get();

	}

	@Override
	public List<Tpcategory> findByCriteriaId(BigDecimal criteriaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Tpcategory tpCategory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Tpcategory tpCategory) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Tpcategory tpCategory) {
		// TODO Auto-generated method stub
		
	}*/

}

package esprit.projet.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import esprit.projet.persistance.dao.CriteriaDefRepository;
import esprit.projet.persistance.model.CriteriaDef;

@Service
@Transactional
public class CriteriaDefService implements ICriteriaDefService {
	
	@Autowired
	private CriteriaDefRepository criteriaDefRepository;
	@Override
	public List<CriteriaDef> findAll() {
		// TODO Auto-generated method stub
		List<CriteriaDef> listCriteriaDefs=	criteriaDefRepository.findAll();
		///listCriteriaDefs.stream().map(x->x).forEach(System.out::println);
		return listCriteriaDefs;
	}

	@Override
	public void add(CriteriaDef criteriaDef) {
		// TODO Auto-generated method stub
		System.out.println("criteriaDef=>"+criteriaDef.getCriteriaId());
		
		criteriaDefRepository.save(criteriaDef);
	}

	@Override
	public void update(CriteriaDef criteriaDef) {
		// TODO Auto-generated method stub
		criteriaDefRepository.save(criteriaDef);

	}

	@Override
	public void delete(CriteriaDef criteriaDef) {
		// TODO Auto-generated method stub
		criteriaDefRepository.delete(criteriaDef);

	}

	@Override
	public CriteriaDef findOne(Integer id) {
		// TODO Auto-generated method stub
		return 		criteriaDefRepository.findById(new BigDecimal(id)).get();

	}

	@Override
	public List<CriteriaDef> getAll() {
		// TODO Auto-generated method stub
		return criteriaDefRepository.getAll();
	}

}

package esprit.projet.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import esprit.projet.persistance.dao.AnnualCriteriaRepository;
import esprit.projet.persistance.dao.CriteriaDefRepository;
import esprit.projet.persistance.model.AnnualCriteria;
import esprit.projet.persistance.model.CriteriaDef;

@Service
@Transactional
public class AnnualCriteriaService implements IAnnualCriteriaService {
	
	@Autowired
	private AnnualCriteriaRepository annualRepository;
	@Override
	public List<AnnualCriteria> findAll() {
		// TODO Auto-generated method stub
		List<AnnualCriteria> listCriteriaDefs=	annualRepository.findAll();
		///listCriteriaDefs.stream().map(x->x).forEach(System.out::println);
		return listCriteriaDefs;
	}

	@Override
	public void add(AnnualCriteria annualCriteria) {
		// TODO Auto-generated method stub
		
		annualRepository.save(annualCriteria);
	}

	@Override
	public void update(AnnualCriteria annualCriteria) {
		// TODO Auto-generated method stub
		annualRepository.save(annualCriteria);

	}

	@Override
	public void delete(AnnualCriteria annualCriteria) {
		// TODO Auto-generated method stub
		annualRepository.delete(annualCriteria);

	}

	@Override
	public AnnualCriteria findOne(Integer id) {
		// TODO Auto-generated method stub
		return 		annualRepository.findById(new BigDecimal(id)).get();

	}

	@Override
	public List<AnnualCriteria> findByYearLocked(Boolean yearlocked) {
		// TODO Auto-generated method stub
		return annualRepository.findByYearLocked(yearlocked);
	}

	@Override
	public List<AnnualCriteria> findByCriteriaYear(BigDecimal criteriayear) {
		// TODO Auto-generated method stub
		 return annualRepository.findByCriteriaYear( criteriayear);
	}

	@Override
	public List<AnnualCriteria> findByCriteriaId(BigDecimal criteriaId) {
		CriteriaDef criteriaDef=new CriteriaDef(criteriaId);
		// TODO Auto-generated method stub
		return annualRepository.findByCriteriaDef(criteriaDef);
	}

}

package esprit.projet.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import esprit.projet.persistance.dao.CriteriaDefRepository;
import esprit.projet.persistance.dao.CriteriaScoreRepository;
import esprit.projet.persistance.model.CriteriaDef;
import esprit.projet.persistance.model.CriteriaScore;

@Service
@Transactional
public class CriteriaScoreService implements ICriteriaScoreService {
	
	@Autowired
	private CriteriaScoreRepository criteriaScoreRepository;
	
	@Autowired
	private CriteriaDefRepository criteriaDefRepository;

	@Override
	public List<CriteriaScore> findAll() {
		// TODO Auto-generated method stub
		List<CriteriaScore> listCriteriaScores=	criteriaScoreRepository.findAll();
		listCriteriaScores.stream().map(x->x).forEach(System.out::println);
		return listCriteriaScores;
	}

	@Override
	public void add(CriteriaScore criteriaScore) {
		// TODO Auto-generated method stub
			criteriaScoreRepository.save(criteriaScore);
	}

	@Override
	public void update(CriteriaScore criteriaScore) {
		// TODO Auto-generated method stub
		criteriaScoreRepository.save(criteriaScore);

	}

	@Override
	public void delete(CriteriaScore criteriaScore) {
		// TODO Auto-generated method stub
		criteriaScoreRepository.delete(criteriaScore);

	}

	@Override
	public CriteriaScore findOne(Integer id) {
		// TODO Auto-generated method stub
		return 		criteriaScoreRepository.findById(new BigDecimal(id)).get();

	}

	@Override
	public List<CriteriaScore> findByCriteriaId(BigDecimal criteriaId) {
		CriteriaDef criteriaDef=criteriaDefRepository.getOne(criteriaId);
		// TODO Auto-generated method stub
		System.out.println("listcscore criteriaDef=>"+criteriaDef);
		
		List<CriteriaScore>  listcscore= 	criteriaScoreRepository.findByCriteriaDef(criteriaDef);
		System.out.println("listcscore=>"+listcscore);
		 	return listcscore;
	}

}

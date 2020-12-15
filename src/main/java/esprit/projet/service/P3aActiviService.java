package esprit.projet.service;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import esprit.projet.persistance.dao.CriteriaDefRepository;
import esprit.projet.persistance.dao.P3aActiviRepository;
import esprit.projet.persistance.model.CriteriaDef;
import esprit.projet.persistance.model.P3aActivi;

@Service
@Transactional
public class P3aActiviService implements IP3aActiviService {
	
	@Autowired
	private P3aActiviRepository p3aActiviRepository;
	
	@Autowired
	private CriteriaDefRepository criteriaDefRepository;

	@Override
	public List<P3aActivi> findAll() {
		// TODO Auto-generated method stub
		List<P3aActivi> listP3aActivis=	p3aActiviRepository.findAll();
		System.out.println("listP3aActivis==>"+listP3aActivis.size());
		///listP3aActivis.stream().map(x->x).forEach(System.out::println);
		return listP3aActivis;
	}

	@Override
	public void add(P3aActivi P3aActivi) {
		// TODO Auto-generated method stub
	
		p3aActiviRepository.save(P3aActivi);
	}

	@Override
	public void update(P3aActivi P3aActivi) {
		// TODO Auto-generated method stub
		p3aActiviRepository.save(P3aActivi);

	}

	@Override
	public void delete(P3aActivi P3aActivi) {
		// TODO Auto-generated method stub
		p3aActiviRepository.delete(P3aActivi);

	}

	@Override
	public P3aActivi findOne(String id) {
		// TODO Auto-generated method stub
		return 		p3aActiviRepository.findById(id).get();

	}

	@Override
	public List<P3aActivi> findByCriteriaId(BigDecimal criteriaId) {
		CriteriaDef criteriaDef=criteriaDefRepository.getOne(criteriaId);
		// TODO Auto-generated method stub
		List<P3aActivi>  listcscore= null;//	p3aActiviRepository.findByCriteriaDef(criteriaDef);
		 	return listcscore;
	}

}

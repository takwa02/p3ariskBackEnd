package esprit.projet.controllers;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import esprit.projet.persistance.model.CriteriaDef;
import esprit.projet.persistance.model.CriteriaScore;
import esprit.projet.service.ICriteriaDefService;
import esprit.projet.service.ICriteriaScoreService;

@RestController
@RequestMapping("/criteriaScore")
@CrossOrigin(origins = "*")
public class CriteriaScoreController {
	
	@Autowired
	private ICriteriaScoreService criteriaScoreService;
	
	@Autowired
	private ICriteriaDefService criteriaDefService;

    //@CrossOrigin
	@GetMapping("/list")
	public List<CriteriaScore> findAll(){
		return criteriaScoreService.findAll();
		
	}
	
	
	
	@PostMapping("/add")
	public void add(@RequestBody CriteriaScore criteriaScore) {
		System.out.println("criteriaScore===>"+criteriaScore);
		 criteriaScoreService.add(criteriaScore);
		
	}

	@PutMapping("/update")
	public  CriteriaScore update(@RequestBody  CriteriaScore criteriaScore) {
		criteriaScoreService.update(criteriaScore);
				return criteriaScore;
		
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		 CriteriaScore criteriaScore=	criteriaScoreService.findOne(id);
		 criteriaScoreService.delete(criteriaScore);
	}
	@GetMapping("/{id}")
	public  CriteriaScore findone(@PathVariable Integer id){
		CriteriaScore criteriaScore= criteriaScoreService.findOne(id);
		return criteriaScore;
		
	}
	
	@GetMapping("/CriteriaDef/{criteriaId}")
	public  	List<CriteriaScore>  findCritereDefone(@PathVariable  BigDecimal criteriaId){
		List<CriteriaScore> criteriaScore= criteriaScoreService.findByCriteriaId(criteriaId);
	System.out.println("criteriaScore="+criteriaScore);
		return criteriaScore;
		
	}
}

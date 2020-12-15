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

import esprit.projet.persistance.model.AnnualCriteria;
import esprit.projet.persistance.model.CriteriaDef;
import esprit.projet.service.IAnnualCriteriaService;
import esprit.projet.service.ICriteriaDefService;

@RestController
@RequestMapping("/annualcriteria")
@CrossOrigin(origins = "*")
public class AnnualCriteriaController {
	
	@Autowired
	private IAnnualCriteriaService annualcriteriaService;
	
    //@CrossOrigin
	@GetMapping("/list")
	public List<AnnualCriteria> findAll(){
		return annualcriteriaService.findAll();
	}
	
	/*@GetMapping("/list/{yearlocked}")
	List<AnnualCriteria> findByYearLocked(@PathVariable Boolean yearlocked){
		return annualcriteriaService.findByYearLocked(yearlocked);
	}*/
	@GetMapping("/list/{criteriayear}")
	List<AnnualCriteria> findByCriteriaYear(@PathVariable BigDecimal criteriayear){
		return annualcriteriaService.findByCriteriaYear(criteriayear);
	}
	
	@GetMapping("/listbycriteria/{criteriaId}")
	List<AnnualCriteria> findByAnnualCriteria(@PathVariable BigDecimal criteriaId){
		System.out.println("criteriaId="+criteriaId);
		return annualcriteriaService.findByCriteriaId(criteriaId);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody AnnualCriteria annualCriteria) {
		//System.out.println("annualCriteria="+annualCriteria.getCriteriaYear());
		 annualcriteriaService.add(annualCriteria);
		
	}

	@PutMapping("/update")
	public  AnnualCriteria update(@RequestBody  AnnualCriteria annualCriteria) {
		annualcriteriaService.update(annualCriteria);
				return annualCriteria;
		
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		AnnualCriteria annualCriteria=	annualcriteriaService.findOne(id);
		 annualcriteriaService.delete(annualCriteria);
	}
}

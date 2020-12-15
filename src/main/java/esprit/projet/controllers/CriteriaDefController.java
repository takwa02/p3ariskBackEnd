package esprit.projet.controllers;

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
import esprit.projet.service.ICriteriaDefService;

@RestController
@RequestMapping("/criteriaDef")
@CrossOrigin(origins = "*")
public class CriteriaDefController {
	
	@Autowired
	private ICriteriaDefService criteriaDefService;
	
    //@CrossOrigin
	@GetMapping("/list")
	public List<CriteriaDef> findAll(){
		return criteriaDefService.findAll();
		
	}
	
	@GetMapping("/getAll")
	public List<CriteriaDef> GetALL(){
		return criteriaDefService.getAll();
		
	}
	
	@PostMapping("/add")
	public void add(@RequestBody CriteriaDef criteriaDef) {
		 criteriaDefService.add(criteriaDef);
		
	}

	@PutMapping("/update")
	public  CriteriaDef update(@RequestBody  CriteriaDef criteriaDef) {
		criteriaDefService.update(criteriaDef);
				return criteriaDef;
		
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		 CriteriaDef criteriaDef=	criteriaDefService.findOne(id);
		 criteriaDefService.delete(criteriaDef);
	}
	@GetMapping("/{id}")
	public  CriteriaDef findone(@PathVariable Integer id){
		CriteriaDef criteriaDef= criteriaDefService.findOne(id);
		System.out.println("criteriaDef="+criteriaDef.getCriteriaId());
		return criteriaDef;
		
	}
}

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
import esprit.projet.persistance.model.P3aActivi;
import esprit.projet.service.ICriteriaDefService;
import esprit.projet.service.IP3aActiviService;

@RestController
@RequestMapping("/p3aActivi")
@CrossOrigin(origins = "*")
public class P3aActiviController {
	
	@Autowired
	private IP3aActiviService p3aActiviService;
	
	@Autowired
	private ICriteriaDefService criteriaDefService;

    //@CrossOrigin
	@GetMapping("/list")
	public List<P3aActivi> findAll(){
		List<P3aActivi> l= p3aActiviService.findAll();
		//l.removeIf(activity->activity==null);
		return l;
	}
	
	
	
	@PostMapping("/add")
	public void add(@RequestBody P3aActivi P3aActivi) {
		System.out.println("P3aActivi===>"+P3aActivi);
		 p3aActiviService.add(P3aActivi);
		
	}

	@PutMapping("/update")
	public  P3aActivi update(@RequestBody  P3aActivi P3aActivi) {
		p3aActiviService.update(P3aActivi);
				return P3aActivi;
		
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		 P3aActivi P3aActivi=	p3aActiviService.findOne(id);
		 p3aActiviService.delete(P3aActivi);
	}
	@GetMapping("/{id}")
	public  P3aActivi findone(@PathVariable String id){
		P3aActivi P3aActivi= p3aActiviService.findOne(id);
		return P3aActivi;
		
	}
	
	@GetMapping("/CriteriaDef/{criteriaId}")
	public  	List<P3aActivi>  findCritereDefone(@PathVariable  BigDecimal criteriaId){
		List<P3aActivi> P3aActivi= p3aActiviService.findByCriteriaId(criteriaId);
	System.out.println("P3aActivi="+P3aActivi);
		return P3aActivi;
		
	}
}

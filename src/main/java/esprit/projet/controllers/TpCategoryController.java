package esprit.projet.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import esprit.projet.persistance.dao.Response;
import esprit.projet.persistance.model.CriteriaDef;
import esprit.projet.persistance.model.TempSelectScores;
import esprit.projet.persistance.model.Tpcategory;
import esprit.projet.service.ICriteriaDefService;
import esprit.projet.service.ITempSelectScoreService;
import esprit.projet.service.ITpCategoryService;

@RestController
@RequestMapping("/tpCategory")
@CrossOrigin(origins = "*")
public class TpCategoryController {
	
	@Autowired
	private ITpCategoryService tpCategoryService;
	
	@Autowired
	private ITempSelectScoreService tempSelectScoreService;

    //@CrossOrigin
	@GetMapping("/list")
	@ResponseStatus(HttpStatus.OK)
		public Response findAll(@RequestParam(name = "page", defaultValue = "0") int page,
	            @RequestParam(name = "size", defaultValue = "1") int size, @RequestParam(name = "economicActivity", defaultValue = "") String economicActivity){
		Pageable  pageRequest = PageRequest.of(page, size);
		
		//Page<Tpcategory> l= tpCategoryService.findAll(pageRequest);
		System.out.println("economicActivity=>"+economicActivity);
		Page<Tpcategory> l= tpCategoryService.findByActLibell(economicActivity.trim(),pageRequest);
		System.out.println(l.getSize()+"   economicActivity=>"+economicActivity);
		
		Response res = new Response(l.getContent(), l.getTotalPages(),
				l.getNumber(), l.getSize());
		System.out.println("response="+res);

return res;
	}
	
	@GetMapping("/tempSelectScore/{ctrMatfis}")
	public ResponseEntity<List<TempSelectScores>> findBymatricule(@PathVariable String ctrMatfis,@RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "1") int size){
		//Pageable  pageRequest = PageRequest.of(page, size);
		List<TempSelectScores> l=new ArrayList<>();
		if(ctrMatfis!=null)
			l= tempSelectScoreService.findBymatricule(ctrMatfis);
		
        return ResponseEntity.ok(l);

	
		
	}
	
	@GetMapping("/tempSelectScore/list")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<TempSelectScores>> findAllTempSelectScore(){
		List<TempSelectScores> l=new ArrayList<>();
		
		l= tempSelectScoreService.findAll();
		
	     return ResponseEntity.ok(l);

	}
	/*@PostMapping("/add")
	public void add(@RequestBody Tpcategory TpCategory) {
		System.out.println("TpCategory===>"+TpCategory);
		 tpCategoryService.add(TpCategory);
		
	}

	@PutMapping("/update")
	public  Tpcategory update(@RequestBody  Tpcategory TpCategory) {
		tpCategoryService.update(TpCategory);
				return TpCategory;
		
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		 Tpcategory TpCategory=	tpCategoryService.findOne(id);
		 tpCategoryService.delete(TpCategory);
	}
	@GetMapping("/{id}")
	public  Tpcategory findone(@PathVariable Integer id){
		Tpcategory TpCategory= tpCategoryService.findOne(id);
		return TpCategory;
		
	}
	
	@GetMapping("/CriteriaDef/{criteriaId}")
	public  	List<Tpcategory>  findCritereDefone(@PathVariable  BigDecimal criteriaId){
		List<Tpcategory> TpCategory= tpCategoryService.findByCriteriaId(criteriaId);
	System.out.println("TpCategory="+TpCategory);
		return TpCategory;
		
	}*/
}

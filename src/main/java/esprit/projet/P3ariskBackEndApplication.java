package esprit.projet;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import esprit.projet.persistance.dao.TpCategoryRepository;

@SpringBootApplication
public class P3ariskBackEndApplication {
	@Autowired
	private TpCategoryRepository tpCategoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(P3ariskBackEndApplication.class, args);
	}
	
	 @PostConstruct
	    private void init() {
		tpCategoryRepository.CallCalculate_Score(2014);
		 System.out.println("exec procedure terminée");
	        
	    }

}

package tn.rnu.isi.eshop.rest;

import tn.rnu.isi.eshop.domain.Categorie;
import tn.rnu.isi.eshop.repository.CategorieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.*;


import java.net.URISyntaxException;

import java.util.List;


/**
 * REST controller pour gerer Categorie.
 */
@RestController
@RequestMapping("/api")
public class CategorieController {

    private final Logger log = LoggerFactory.getLogger(CategorieController.class);

    private static final String ENTITY_NAME = "categorie";

    private final CategorieRepository categorieRepository;
    
    /**
     * Injection du repository:
     * @param categorieRepository
     */

    public CategorieController(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @GetMapping("/categories")
    public List<Categorie> getAllCategories() throws URISyntaxException {
        return (List<Categorie>) categorieRepository.findAll();
    }

    @PostMapping("/categories")
    void addCategorie(@RequestBody Categorie categorie) {
    	categorieRepository.save(categorie);
    }
     
    @PutMapping("/categories")
    public void updateCategorie(@RequestBody Categorie categorie)  {
         if (categorie.getIdCateg() != null) {
        	 categorieRepository.save(categorie);
        }
       
         
    }

   
    @GetMapping("/categories/{id}")
    public Categorie getCategorie(@PathVariable Long idCategorie) {
        return  categorieRepository.findByIdCateg(idCategorie);
     }

 
    @DeleteMapping("/categories/{id}")
    public void deleteCategorie(@PathVariable Long id) {
        log.debug("REST request to delete Categorie : {}", id);
        categorieRepository.deleteById(id);
    }
}

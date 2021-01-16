package tn.rnu.isi.eshop.rest;

import tn.rnu.isi.eshop.domain.Produit;
import tn.rnu.isi.eshop.repository.ProduitRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

import java.util.List;


/**
 * REST controller Pour gerer Produit.
 */
@RestController
@RequestMapping("/api")
public class ProduitController {

    private final Logger log = LoggerFactory.getLogger(ProduitController.class);

    private static final String ENTITY_NAME = "produit";

    private final ProduitRepository produitRepository;
    
    /**
     * Injection du repository:
     * @param produitRepository
     */

    public ProduitController(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }
/**
 * ist<Produit> getAllProduits() 
 * @return
 */
    @GetMapping("/produits")
    public List<Produit> getAllProduits()  {
        return (List<Produit>) produitRepository.findAll();
    }

    @PostMapping("/produits")
    void addProduit(@RequestBody Produit produit)  {
    	produitRepository.save(produit);
    }
     
    @PutMapping("/produits")
    public void updateProduit(@RequestBody Produit produit) {
         if (produit.getIdProduit() != null) {
             produitRepository.save(produit);
        }
         
    }

   
    @GetMapping("/produits/{id}")
    public Produit getProduit(@PathVariable Long idProduit) {
        return  produitRepository.findByIdProduit(idProduit);
     }

 
    @DeleteMapping("/produits/{id}")
    public void deleteProduit(@PathVariable Long id) {
        log.debug("REST request to delete Produit : {}", id);
        produitRepository.deleteById(id);
    }
}

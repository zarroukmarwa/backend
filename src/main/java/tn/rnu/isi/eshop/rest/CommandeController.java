package tn.rnu.isi.eshop.rest;

import tn.rnu.isi.eshop.domain.Commande;
import tn.rnu.isi.eshop.repository.CommandeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.*;


import java.net.URISyntaxException;

import java.util.List;


/**
 * REST controller pour gerer Commande.
 */
@RestController
@RequestMapping("/api")
public class CommandeController {

    private final Logger log = LoggerFactory.getLogger(CommandeController.class);

    private static final String ENTITY_NAME = "commande";

    private final CommandeRepository commandeRepository;
    
    /**
     * Injection du repository:
     * @param commandeRepository
     */

    public CommandeController(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @GetMapping("/commandes")
    public List<Commande> getAllCommandes() throws URISyntaxException {
        return (List<Commande>) commandeRepository.findAll();
    }

    @PostMapping("/commandes")
    void addCommande(@RequestBody Commande commande) throws URISyntaxException {
    	commandeRepository.save(commande);
    }
     
    @PutMapping("/commandes")
    public void updateCommande(@RequestBody Commande commande)  {
         if (commande.getIdCommande() != null) {
             commandeRepository.save(commande);
   }
         
    }

   
    @GetMapping("/commandes/{id}")
    public Commande getCommande(@PathVariable Long idCommande) {
        return  commandeRepository.findByIdCommande(idCommande);
     }

 
    @DeleteMapping("/commandes/{id}")
    public void deleteCommande(@PathVariable Long id) {
        log.debug("REST request to delete Commande : {}", id);
        commandeRepository.deleteById(id);
    }
}

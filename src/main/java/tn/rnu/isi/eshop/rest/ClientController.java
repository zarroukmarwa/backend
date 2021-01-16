package tn.rnu.isi.eshop.rest;

import tn.rnu.isi.eshop.domain.Client;
import tn.rnu.isi.eshop.repository.ClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.*;


import java.net.URISyntaxException;

import java.util.List;


/**
 * REST controller pour gerer Client.
 */
@RestController
@RequestMapping("/api")
public class ClientController {

    private final Logger log = LoggerFactory.getLogger(ClientController.class);

    private static final String ENTITY_NAME = "client";

    private final ClientRepository clientRepository;
    
    /**
     * Injection du repository:
     * @param clientRepository
     */

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/clients")
    public List<Client> getAllClients() throws URISyntaxException {
        return (List<Client>) clientRepository.findAll();
    }

    @PostMapping("/clients")
    void addClient(@RequestBody Client client) throws URISyntaxException {
    	clientRepository.save(client);
    }
     
    @PutMapping("/clients")
    public void updateClient(@RequestBody Client client)  {
         if (client.getIdClient() != null) {
        	 clientRepository.save(client);
        	 }
      
    }

   
    @GetMapping("/clients/{id}")
    public Client getClient(@PathVariable Long idClient) {
        return  clientRepository.findByIdClient(idClient);
     }

 
    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable Long id) {
        log.debug("REST request to delete Client : {}", id);
        clientRepository.deleteById(id);
    }
}

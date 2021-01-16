package tn.rnu.isi.eshop.repository;

import tn.rnu.isi.eshop.domain.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
	
 public Client findByIdClient(Long idClient)	;

}

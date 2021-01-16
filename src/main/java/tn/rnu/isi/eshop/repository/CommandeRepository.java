package tn.rnu.isi.eshop.repository;

import tn.rnu.isi.eshop.domain.Commande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

 
@Repository
public interface CommandeRepository extends CrudRepository<Commande, Long> {

	Commande findByIdCommande(Long idCommande);

}

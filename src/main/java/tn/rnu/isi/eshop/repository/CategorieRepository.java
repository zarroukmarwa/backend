package tn.rnu.isi.eshop.repository;

import tn.rnu.isi.eshop.domain.Categorie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

 
@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Long> {

	Categorie findByIdCateg(Long idCateg);

}

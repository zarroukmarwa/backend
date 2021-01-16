package tn.rnu.isi.eshop.repository;

import tn.rnu.isi.eshop.domain.Produit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

	Produit findByIdProduit(Long idProduit);

}

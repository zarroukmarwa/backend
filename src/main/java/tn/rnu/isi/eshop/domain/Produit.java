package tn.rnu.isi.eshop.domain;
 
 import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Produit  
 */
@Entity
@Table(name = "PRODUIT")

public class Produit implements java.io.Serializable {

	private Long  idProduit;
	
	private Categorie categorie;
	private String desigProduit;
	private BigDecimal  puProduit;
	private Long  qteProduit;
	private String configProduit;
	private String marqueProduit;
	private String modeleProduit;
	
	 @JsonIgnore
	private Set<Commande> commandes = new HashSet<Commande>(0);

	public Produit() {
	}

	public Produit(Long  idProduit, Categorie categorie) {
		this.idProduit = idProduit;
		this.categorie = categorie;
	}

	public Produit(Long  idProduit, Categorie categorie, String desigProduit, BigDecimal  puProduit,
			Long  qteProduit, String configProduit, String marqueProduit, String modeleProduit,
			Set<Commande> commandes) {
		this.idProduit = idProduit;
		this.categorie = categorie;
		this.desigProduit = desigProduit;
		this.puProduit = puProduit;
		this.qteProduit = qteProduit;
		this.configProduit = configProduit;
		this.marqueProduit = marqueProduit;
		this.modeleProduit = modeleProduit;
		this.commandes = commandes;
	}

	@Id
	@Column(name = "ID_PRODUIT")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="PRODUIT_gen_seq")
    @SequenceGenerator(name="PRODUIT_gen_seq", sequenceName="PRODUIT_SEQ", allocationSize=1)

	public Long  getIdProduit() {
		return this.idProduit;
	}

	public void setIdProduit(Long  idProduit) {
		this.idProduit = idProduit;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CATEG", nullable = false)
	public Categorie getCategorie() {
		return this.categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Column(name = "DESIG_PRODUIT", length = 100)
	public String getDesigProduit() {
		return this.desigProduit;
	}

	public void setDesigProduit(String desigProduit) {
		this.desigProduit = desigProduit;
	}

	@Column(name = "PU_PRODUIT", scale = 2)
	public BigDecimal  getPuProduit() {
		return this.puProduit;
	}

	public void setPuProduit(BigDecimal  puProduit) {
		this.puProduit = puProduit;
	}

	@Column(name = "QTE_PRODUIT")
	public Long  getQteProduit() {
		return this.qteProduit;
	}

	public void setQteProduit(Long  qteProduit) {
		this.qteProduit = qteProduit;
	}

	@Column(name = "CONFIG_PRODUIT", length = 100)
	public String getConfigProduit() {
		return this.configProduit;
	}

	public void setConfigProduit(String configProduit) {
		this.configProduit = configProduit;
	}

	@Column(name = "MARQUE_PRODUIT", length = 50)
	public String getMarqueProduit() {
		return this.marqueProduit;
	}

	public void setMarqueProduit(String marqueProduit) {
		this.marqueProduit = marqueProduit;
	}

	@Column(name = "MODELE_PRODUIT", length = 50)
	public String getModeleProduit() {
		return this.modeleProduit;
	}

	public void setModeleProduit(String modeleProduit) {
		this.modeleProduit = modeleProduit;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produit")
	public Set<Commande> getCommandes() {
		return this.commandes;
	}
	@JsonIgnore
	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}
 
}

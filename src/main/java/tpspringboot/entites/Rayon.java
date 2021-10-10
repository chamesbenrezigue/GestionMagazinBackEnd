package tpspringboot.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "Rayon")
public class Rayon implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name ="idRayon")
	private Long idRayon;

	@Column (name ="code")
	private String code;

	@Column (name ="libelle")
	private String libelle;
	
	@OneToMany (mappedBy ="rayon")
	private List<Produit> produits;
	
	public Rayon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public Rayon(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}

	public Long getIdRayon() {
		return idRayon;
	}

	public void setIdRayon(Long idRayon) {
		this.idRayon = idRayon;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Rayon [idRayon=" + idRayon + ", code=" + code + ", libelle=" + libelle + "]";
	}

	
	
	

	
}
package tpspringboot.entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "Produit")
public class Produit implements Serializable {
	
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column (name ="idProduit")
private Long idProduit;

@Column (name ="code")
private String code;

@Column (name ="libelle")
private String libelle;

@Column (name ="prixUnitaire")
private float prixUnitaire;

@ManyToOne
private Stock stock;

@ManyToOne
private Rayon rayon;

@ManyToOne
private detailFacture detailfacture;

@OneToOne (mappedBy ="produit")
private DetailProduit detailProduit;


@ManyToMany (mappedBy ="produits",fetch = FetchType.EAGER)
private Collection<Fournisseur> fournisseurs=new ArrayList<>();

public Produit() {
	super();
}

public Produit(String code, String libelle, float prixUnitaire) {
	super();
	this.code = code;
	this.libelle = libelle;
	this.prixUnitaire = prixUnitaire;
}

public Long getIdProduit() {
	return idProduit;
}
public void setIdProduit(Long idProduit) {
	this.idProduit = idProduit;
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
public float getPrixUnitaire() {
	return prixUnitaire;
}
public void setPrixUnitaire(float prixUnitaire) {
	this.prixUnitaire = prixUnitaire;
}

public Stock getStock() {
	return stock;
}

public void setStock(Stock stock) {
	this.stock = stock;
}

public Rayon getRayon() {
	return rayon;
}

public void setRayon(Rayon rayon) {
	this.rayon = rayon;
}

public detailFacture getDetailfacture() {
	return detailfacture;
}

public void setDetailfacture(detailFacture detailfacture) {
	this.detailfacture = detailfacture;
}

public DetailProduit getDetailProduit() {
	return detailProduit;
}

public void setDetailProduit(DetailProduit detailProduit) {
	this.detailProduit = detailProduit;
}


public Collection<Fournisseur> getFournisseurs() {
	return fournisseurs;
}

public void setFournisseurs(Collection<Fournisseur> fournisseurs) {
	this.fournisseurs = fournisseurs;
}

@Override
public String toString() {
	return "Produit [idProduit=" + idProduit + ", code=" + code + ", libelle=" + libelle + ", prixUnitaire="
			+ prixUnitaire + "]";
}





}

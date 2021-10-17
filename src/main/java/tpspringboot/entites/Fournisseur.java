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
import javax.persistence.Table;

@Entity
@Table( name = "Fournisseur")
public class Fournisseur implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name ="idFournisseur")
	private Long idFournisseur;
	
	@Column (name ="code")
	private String code;

	@Column (name ="libelle")
	private String libelle;
	
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fournisseur(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}

	public Long getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
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
		return "Fournisseur [idFournisseur=" + idFournisseur + ", code=" + code + ", libelle=" + libelle + "]";
	}

	

}

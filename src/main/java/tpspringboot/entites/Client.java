package tpspringboot.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "Client")
public class Client implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name ="idClient")
	private Long idClient;

	@Column (name ="nom")
	private String nom;
	
	@Column (name ="prenom")
	private String prenom;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	@Column (name ="password")
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Profession profession;
	
	@Enumerated(EnumType.STRING)
	private CategorieClient categorieClient;
	
	@OneToMany (mappedBy ="client")
	private List<Facture> factures;
	
	
	
	
	public Client() {
		super();
	}
	
	
	public Client(String nom, String prenom, Date dateNaissance, String password, Profession profession,
			CategorieClient categorieClient) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.password = password;
		this.profession = profession;
		this.categorieClient = categorieClient;
	}


	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Profession getProfession() {
		return profession;
	}
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	public CategorieClient getCategorieClient() {
		return categorieClient;
	}
	public void setCategorieClient(CategorieClient categorieClient) {
		this.categorieClient = categorieClient;
	}


	public List<Facture> getFactures() {
		return factures;
	}


	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}


	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
				+ dateNaissance + ", password=" + password + ", profession=" + profession + ", categorieClient="
				+ categorieClient + "]";
	}
	
	
}

package tpspringboot.entites;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "DetailProduit")
public class DetailProduit implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idDetailProduit;
	
	@Column (name ="datecreation")
	private Date datecreation;
	
	@Column (name ="dateDernierModification")
	private String dateDernierModification; 
	
	@Enumerated(EnumType.STRING)
	private categorieProduit categorieP;
	
	@OneToOne(mappedBy ="detailProduit")
	private Produit produit;
	
	
	
	
	public DetailProduit() {
		super();
	}




	public DetailProduit(Long idDetailProduit, Date datecreation, String dateDernierModification,
			categorieProduit categorieP) {
		super();
		this.idDetailProduit = idDetailProduit;
		this.datecreation = datecreation;
		this.dateDernierModification = dateDernierModification;
		this.categorieP = categorieP;
	}




	public Long getIdDetailProduit() {
		return idDetailProduit;
	}




	public void setIdDetailProduit(Long idDetailProduit) {
		this.idDetailProduit = idDetailProduit;
	}




	public Date getDatecreation() {
		return datecreation;
	}




	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}




	public String getDateDernierModification() {
		return dateDernierModification;
	}




	public void setDateDernierModification(String dateDernierModification) {
		this.dateDernierModification = dateDernierModification;
	}




	public categorieProduit getCategorieP() {
		return categorieP;
	}




	public void setCategorieP(categorieProduit categorieP) {
		this.categorieP = categorieP;
	}




	@Override
	public String toString() {
		return "DetailProduit [idDetailProduit=" + idDetailProduit + ", datecreation=" + datecreation
				+ ", dateDernierModification=" + dateDernierModification + ", categorieP=" + categorieP + "]";
	}
	
	

}

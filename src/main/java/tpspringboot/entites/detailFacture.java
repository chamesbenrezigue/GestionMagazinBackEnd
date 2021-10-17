package tpspringboot.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "detailFacture")
public class detailFacture implements Serializable{

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name ="idDetailFacture")
	private Long idDetailFacture;
	
	@Column (name ="qte")
	private int qte;
	
	@Column (name ="prixTotal")
	private float prixTotal;
	
	@Column (name ="pourcentageRemise")
	private int pourcentageRemise;
	
	@Column (name ="montantRemise")
	private float montantRemise;
	
	@ManyToOne 
	private Produit produits;
	
	@ManyToOne
	private Facture facture;

	public detailFacture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public detailFacture(int qte, float prixTotal, int pourcentageRemise, float montantRemise) {
		super();
		this.qte = qte;
		this.prixTotal = prixTotal;
		this.pourcentageRemise = pourcentageRemise;
		this.montantRemise = montantRemise;
	}

	public Long getIdDetailFacture() {
		return idDetailFacture;
	}

	public void setIdDetailFacture(Long idDetailFacture) {
		this.idDetailFacture = idDetailFacture;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}
	



	public Produit getProduits() {
		return produits;
	}

	public void setProduits(Produit produits) {
		this.produits = produits;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}

	public int getPourcentageRemise() {
		return pourcentageRemise;
	}

	public void setPourcentageRemise(int pourcentageRemise) {
		this.pourcentageRemise = pourcentageRemise;
	}

	public float getMontantRemise() {
		return montantRemise;
	}

	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}

	@Override
	public String toString() {
		return "detailFacture [idDetailFacture=" + idDetailFacture + ", qte=" + qte + ", prixTotal=" + prixTotal
				+ ", pourcentageRemise=" + pourcentageRemise + ", montantRemise=" + montantRemise + "]";
	}
	
	
	
	
	
}

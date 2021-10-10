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
@Table( name = "Stock")
public class Stock implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name ="idStock")
	private Long idStock;
	
	@Column (name ="qte")
	private int qte;
	
	@Column (name ="qteMin")
	private int qteMin;
	
	@Column (name ="libelleStock")
	private String libelleStock;

	@OneToMany (mappedBy ="stock")
	private List<Produit> produits;
	

	public List<Produit> getProduits() {
		return produits;
	}


	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}


	public Stock() {
		super();
	}


	public Stock(int qte, int qteMin, String libelleStock) {
		super();
		this.qte = qte;
		this.qteMin = qteMin;
		this.libelleStock = libelleStock;
	}
	
	
	public Long getIdStock() {
		return idStock;
	}


	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public int getQteMin() {
		return qteMin;
	}

	public void setQteMin(int qteMin) {
		this.qteMin = qteMin;
	}

	public String getLibelleStock() {
		return libelleStock;
	}

	public void setLibelleStock(String libelleStock) {
		this.libelleStock = libelleStock;
	}


	@Override
	public String toString() {
		return "Stock [idStock=" + idStock + ", qte=" + qte + ", qteMin=" + qteMin + ", libelleStock=" + libelleStock
				+ "]";
	}
	
	
}

package tpspringboot.entites;

import java.io.Serializable;
import java.util.Date;
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
@Table( name = "Facture")
public class Facture implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name ="idFacture")
	private Long idFacture;
	
	@Column (name ="montantRemise")
	private float montantRemise;
	
	@Column (name ="montantFacture")
	private float montantFacture;
	
	@Column (name ="dateFacture")
	private Date dateFacture;
	
	@Column (name ="active")
	private boolean active;
	
	@OneToMany (mappedBy ="facture")
	private List<detailFacture> detailfactures;
	
	@ManyToOne
	private Client client;
	
	public List<detailFacture> getDetailfactures() {
		return detailfactures;
	}

	public void setDetailfactures(List<detailFacture> detailfactures) {
		this.detailfactures = detailfactures;
	}

	public Facture() {
		super();
	}

	public Facture(float montantRemise, float montantFacture, Date dateFacture, boolean active) {
		super();
		this.montantRemise = montantRemise;
		this.montantFacture = montantFacture;
		this.dateFacture = dateFacture;
		this.active = active;
	}

	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public float getMontantRemise() {
		return montantRemise;
	}

	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}

	public float getMontantFacture() {
		return montantFacture;
	}

	public void setMontantFacture(float montantFacture) {
		this.montantFacture = montantFacture;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", montantRemise=" + montantRemise + ", montantFacture="
				+ montantFacture + ", dateFacture=" + dateFacture + ", active=" + active + "]";
	}
	
	
	
	
	
	

}

package domain.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity(name= "Bedrijven")
@Table(name="Bedrijven")
public class Bedrijven {
	
	
	private int hangernr;
	private String vliegtuigtype;
	private String modelnrs;
	private int capaciteit;
	private int gewicht;
	private String eigenaar;
	
	@Id
	@Column(name = "naam")
	private String naam;
	
	@OneToMany
	@JoinColumn (name="modelnr", foreignKey = @ForeignKey(name="vliegtuig_eigenaar_nr"))
	private Set <Vliegtuig> modelnr = new HashSet<>();
	
	
	
	@Override
	public String toString() {
		return "Bedrijven [naam=" + naam + ", hangernr=" + hangernr + ", vliegtuigtype=" + vliegtuigtype + ", modelnr="
				+ modelnrs + ", capaciteit=" + capaciteit + ", gewicht=" + gewicht + ", eigenaar=" + eigenaar + "]";
	}


	public Bedrijven(String naam, int hangernr, String vliegtuigtype, String modelnr, int capaciteit, int gewicht,
			String eigenaar) {
		super();
		this.naam = naam;
		this.hangernr = hangernr;
		this.vliegtuigtype = vliegtuigtype;
		this.modelnrs = modelnr;
		this.capaciteit = capaciteit;
		this.gewicht = gewicht;
		this.eigenaar = eigenaar;
	}


	public String getNaam() {
		return naam;
	}


	public void setNaam(String naam) {
		this.naam = naam;
	}


	public int getHangernr() {
		return hangernr;
	}


	public void setHangernr(int hangernr) {
		this.hangernr = hangernr;
	}


	public String getVliegtuigtype() {
		return vliegtuigtype;
	}


	public void setVliegtuigtype(String vliegtuigtype) {
		this.vliegtuigtype = vliegtuigtype;
	}


	public String getModelnr() {
		return modelnrs;
	}


	public void setModelnr(String modelnr) {
		this.modelnrs = modelnr;
	}


	public int getCapaciteit() {
		return capaciteit;
	}


	public void setCapaciteit(int capaciteit) {
		this.capaciteit = capaciteit;
	}


	public int getGewicht() {
		return gewicht;
	}


	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}


	public String getEigenaar() {
		return eigenaar;
	}


	public void setEigenaar(String eigenaar) {
		this.eigenaar = eigenaar;
	}
	
	

}

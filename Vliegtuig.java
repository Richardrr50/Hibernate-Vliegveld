package domain.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity(name= "Vliegtuig")
@Table(name="Vliegtuig")
public class Vliegtuig implements Serializable{
	
	
	private int hangernr;
	private String vliegtuigtype;
	private int capaciteit;
	private int gewicht;
	private String eigenaar;
	

	//@Id
	//@Column(name="modelnr")
	private String modelnr;
	
	@Id
	@Column(name="registratienr")
	private int registratienr;
	

	@OneToMany
	@JoinColumn(name="registratienr", foreignKey= @ForeignKey(name="onderhoud_FK"))
	private Set<Onderhoud> registratienrs = new HashSet<>();
	
	@OneToMany
	@JoinColumn(name="hangernr", foreignKey = @ForeignKey(name="hangernr_FK"))
	private Set <Hanger> hanger_nummer = new HashSet<>();
	
	
	@Override
	public String toString() {
		return "Vliegtuig [registratienr=" + registratienr + ", hangernr=" + hangernr + ", vliegtuigtype="
				+ vliegtuigtype + ", modelnr=" + modelnr + ", capaciteit=" + capaciteit + ", gewicht=" + gewicht
				+ ", eigenaar=" + eigenaar + "]";
	}


	public int getRegistratienr() {
		return registratienr;
	}


	public void setRegistratienr(int registratienr) {
		this.registratienr = registratienr;
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
		return modelnr;
	}


	public void setModelnr(String modelnr) {
		this.modelnr = modelnr;
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


	public Vliegtuig(int registratienr, int hangernr, String vliegtuigtype, String modelnr, int capaciteit, int gewicht,
			String eigenaar) {
		super();
		this.registratienr = registratienr;
		this.hangernr = hangernr;
		this.vliegtuigtype = vliegtuigtype;
		this.modelnr = modelnr;
		this.capaciteit = capaciteit;
		this.gewicht = gewicht;
		this.eigenaar = eigenaar;
	}

	
	
}

package domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name= "Werknemers")
@Table(name="Werknemers")
public class Werknemers {
	
	
	@Id
	@Column (name="Werknemer_BSN")
	private int BSN;
	
	private String naam;
	private String voornaam;
	private String huisnummer;
	private String straat;
	private String plaats;
	private String postcode;
	private int telefoonnr;
	private int salaris;
	private int shift;
	
	@OneToOne
	@JoinColumn(name="Piloot_Werknemer_FK", foreignKey = @ForeignKey(name="piloot_werknemer_fk"))
	private Piloot BSN_Piloot;
	

	
	@Override
	public String toString() {
		return "Werknemers [BSN=" + BSN + ", naam=" + naam + ", voornaam=" + voornaam + ", huisnummer=" + huisnummer
				+ ", straat=" + straat + ", plaats=" + plaats + ", postcode=" + postcode + ", telefoonnr=" + telefoonnr
				+ ", salaris=" + salaris + ", shift=" + shift + "]";
	}
	
	
	


	public Werknemers(int bSN, String naam, String voornaam, String huisnummer, String straat, String plaats,
			String postcode, int telefoonnr, int salaris, int shift) {
		super();
		BSN = bSN;
		this.naam = naam;
		this.voornaam = voornaam;
		this.huisnummer = huisnummer;
		this.straat = straat;
		this.plaats = plaats;
		this.postcode = postcode;
		this.telefoonnr = telefoonnr;
		this.salaris = salaris;
		this.shift = shift;
	}





	public int getBSN() {
		return BSN;
	}


	public void setBSN(int bSN) {
		BSN = bSN;
	}


	public String getNaam() {
		return naam;
	}


	public void setNaam(String naam) {
		this.naam = naam;
	}


	public String getVoornaam() {
		return voornaam;
	}


	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}


	public String getHuisnummer() {
		return huisnummer;
	}


	public void setHuisnummer(String huisnummer) {
		this.huisnummer = huisnummer;
	}


	public String getStraat() {
		return straat;
	}


	public void setStraat(String straat) {
		this.straat = straat;
	}


	public String getPlaats() {
		return plaats;
	}


	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}


	public String getPostcode() {
		return postcode;
	}


	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}


	public int getTelefoonnr() {
		return telefoonnr;
	}


	public void setTelefoonnr(int telefoonnr) {
		this.telefoonnr = telefoonnr;
	}


	public int getSalaris() {
		return salaris;
	}


	public void setSalaris(int salaris) {
		this.salaris = salaris;
	}


	public int getShift() {
		return shift;
	}


	public void setShift(int shift) {
		this.shift = shift;
	}
	
	
	

}

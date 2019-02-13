package domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity(name= "Piloot")
@Table(name="Piloot")

public class Piloot {
	
	
	private String naam;
	private String voornaam;
	private String straatnaam;
	private String huisnummer;
	private String woonplaats;
	private String postcode;
	private int telefoonnr;
	private int licentienr;
	private String beperking;
	
	
	@Id
	@Column (name="BSN")
	private int BSN;
	
	
	
	
	
	public Piloot(int bSN, String naam, String voornaam, String straatnaam, String huisnummer, String woonplaats,
			String postcode, int telefoonnr, int licentienr, String beperking) {
		super();
		BSN = bSN;
		this.naam = naam;
		this.voornaam = voornaam;
		this.straatnaam = straatnaam;
		this.huisnummer = huisnummer;
		this.woonplaats = woonplaats;
		this.postcode = postcode;
		this.telefoonnr = telefoonnr;
		this.licentienr = licentienr;
		this.beperking = beperking;
	}


	public Piloot() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Piloot [BSN=" + BSN + ", naam=" + naam + ", voornaam=" + voornaam + ", straatnaam=" + straatnaam
				+ ", huisnummer=" + huisnummer + ", woonplaats=" + woonplaats + ", postcode=" + postcode
				+ ", telefoonnr=" + telefoonnr + ", licentienr=" + licentienr + ", beperking=" + beperking + "]";
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


	public String getStraatnaam() {
		return straatnaam;
	}


	public void setStraatnaam(String straatnaam) {
		this.straatnaam = straatnaam;
	}


	public String getHuisnummer() {
		return huisnummer;
	}


	public void setHuisnummer(String huisnummer) {
		this.huisnummer = huisnummer;
	}


	public String getWoonplaats() {
		return woonplaats;
	}


	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
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


	public int getLicentienr() {
		return licentienr;
	}


	public void setLicentienr(int licentienr) {
		this.licentienr = licentienr;
	}


	public String getBeperking() {
		return beperking;
	}


	public void setBeperking(String beperking) {
		this.beperking = beperking;
	}
	
	
	

}

package domain.model;

import java.util.Calendar;
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


@Entity(name= "Onderhoud")
@Table(name="Onderhoud")
public class Onderhoud {
	
	@Id
	@Column (name = "registratienr")
	

	//@ManyToOne
	//@JoinColumn(name="registratienr", foreignKey =@ForeignKey(name="onderhoud_vliegtuig"))
	//private Set <Vliegtuig> registratienrs = new HashSet<>();
	
	
	
	private int registratienr;
	private Calendar datum;
	private String tijd;
	private String type_Werk;

	public Onderhoud(int registratienr, Calendar datum, String tijd, String type_Werk) {
		super();
		this.registratienr = registratienr;
		this.datum = datum;
		this.tijd = tijd;
		this.type_Werk = type_Werk;
	}


	@Override
	public String toString() {
		return "Onderhoud [registratienr=" + registratienr + ", datum=" + datum + ", tijd=" + tijd + ", type_Werk="
				+ type_Werk + "]";
	}


	public int getRegistratienr() {
		return registratienr;
	}


	public void setRegistratienr(int registratienr) {
		this.registratienr = registratienr;
	}


	public Calendar getDatum() {
		return datum;
	}


	public void setDatum(Calendar datum) {
		this.datum = datum;
	}


	public String getTijd() {
		return tijd;
	}


	public void setTijd(String tijd) {
		this.tijd = tijd;
	}


	public String getType_Werk() {
		return type_Werk;
	}


	public void setType_Werk(String type_Werk) {
		this.type_Werk = type_Werk;
	}

	
}

package domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name= "Hanger")
@Table(name="Hanger")
public class Hanger {
	
	@Id
	@Column(name = "hanger_nummer")
	private int nummer;
	
	
	
	private int oppervlakte;

}

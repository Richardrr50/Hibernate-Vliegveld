package domain.model;

import datalayer.factories.DAOFactories;
import datalayer.factories.DAOFactory;
import datalayer.utils.HibernateSessionManager;

public class Starter {

	public static void main(String[] args) {
		
		DAOFactory.setTheFactory(DAOFactories.HIBERNATE.getTheFactory());
		
		
		// default constructor
		Piloot p = new Piloot();
		
		
		// maakt piloot aan en voegt hem toe aan de database.
		Piloot pp = new Piloot(123455, "de Munck", "Richard", "straat", "1a", "Vlissingen", "1234AA", 123446, 225862, "bril +1");
		
		
		DAOFactory.getTheFactory().getPilootDAO().saveOrUpdate(pp);
		
		HibernateSessionManager.shutdown();
		

	}

}

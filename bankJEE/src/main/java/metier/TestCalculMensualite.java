package metier;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculMensualite {
	
	private IcreditMetier icreditMetier;
	
	@Before
	public void setUp() {
		icreditMetier = new CreditMetierImpl();
	}

	@Test
	public void testCalculerMensualiteCredit() {
		double capitale = 200000;
		int  duree = 240;
		double taux = 4.5;
		
		double resultatAttendu = 1265.2987;
		double resultatCalcule = icreditMetier.calculerMensualiteCredit(capitale, taux, duree);
		
		assertEquals(resultatAttendu, resultatCalcule, 0.0001);
	}

}

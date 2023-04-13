import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import junit.framework.*;
/**
 * classe de test permettant de tester la classe Lampe
 */
public class LampeTest {

	/**
	 * test du constructeur de lampe
	 */
	@Test
	public void testLampe() {
		// methode testee
		Lampe l = new Lampe("lampe1");

		// verification
		boolean res = l.isAllume();
		assertFalse(res, "Une nouvelle lampe devrait être éteinte");
	}


	/**
	 * test allumer une lampe eteinte
	 */
	@Test
	public void testAllumer() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");

		//methode testee
		l.allumer();

		// verification
		boolean res = l.isAllume();
		assertTrue(res, "La lampe devrait être allumée");
	}

	@Test
	/**
	 * test allumer une lampe allumee
	 */
	public void testAllumer_allumee() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		l.allumer();

		//methode testee
		l.allumer();

		// verification
		boolean res = l.isAllume();
		assertTrue(res,"la lampe devrait rester allumée");
	}

	@Test
	/**
	 * test eteindre une lampe allumee
	 */
	public void testeteindre_allumee() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		l.allumer();

		//methode testee
		l.eteindre();

		// verification
		boolean res = l.isAllume();
		assertFalse(res,"la lampe devrait être éteinte");
	}

	@Test
	/**
	 * test to String lampe eteinte
	 */
	public void testToString_eteinte() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");

		//methode testee
		String r=""+l;

		//verification
		assertEquals("lampe1: Off",r,"l'affichage devrait être off");
	}

	@Test
	/**
	 * test to String lampe allumee
	 */
	public void testToString_allumee() {
		// preparation des donnees
		Lampe l = new Lampe("lampe1");
		l.allumer();

		//methode testee
		String r=""+l;

		//verification
		assertEquals("lampe1: On",r,"l'affichage devrait être off");

	}

}



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PersonneTest {
	private Personne p;
	private Personne p2;
	private Personne p3;
	private Personne p4;
	
	
	@Before
	public void setUp() throws Exception {
		p = new Personne("martin","laurent");	
		p2 = new Personne("mar tin","Laurent");	
		p3 = new Personne("mar-tin","Laurent");	
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPersonne() {
		
		Assert.assertEquals("Pas de majuscules !","Lmartin",p.getLogin());
		Assert.assertEquals("Pas d'espace !","Lmartin",p2.getLogin());
		Assert.assertEquals("Pas de tiret. !","Lmartin",p3.getLogin());
		
		
	}
	@Test
	public void testToString() {
		Assert.assertEquals("Pas de tiret. !","Nom : martin Prenom : laurent Login : Lmartin",p.toString());
		
	}
}

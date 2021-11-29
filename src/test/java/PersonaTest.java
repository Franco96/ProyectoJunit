import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {
	
	Persona persona = new Persona();

	
	@Before
    public void init() {

       persona.setNombre("Lautaro");
       persona.setEdad(25);
    }
	

	
	@Test
	public void SaludoTest() {
		
		assertEquals("Hola soy "+persona.getNombre(), persona.saludar());
	}

	
	@Test
	public void EsMayorQueConPersonaMenorTest() {
		
		Persona personaMenor = new Persona();
		personaMenor.setNombre("juan");
		personaMenor.setEdad(20);
		
		assertEquals(false, persona.esMayorQue(personaMenor));
	}
	
	@Test
	public void EsMayorQueConPersonaMayorTest() {
		
		Persona personaMayor = new Persona();
		personaMayor.setNombre("juan");
		personaMayor.setEdad(30);
		
		assertEquals(false, persona.esMayorQue(personaMayor));
	}
	@Test
	public void cumpleaniosTest() {
		
		int edadCumple = persona.getEdad() +1 ;
		
		assertEquals(edadCumple , persona.cumpleanios());
	}
	
	
}

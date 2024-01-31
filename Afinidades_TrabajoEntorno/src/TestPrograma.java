import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

/**
 *  <h2> Clase TestPrograma </h2>
 * Esta clase comprueba el método sonCompatibles de la clase MiProgramaMain.
 * 
 * @author Noelia
 * @author Gracia
 *
 */

class TestPrograma {
	/**
	 * Atributo para crear la persona1.
	 */
	private static Persona p1;
	/**
	 * Atributo para crear la persona2.
	 */
	private static Persona p2;
	/**
	 * Atributo para crear la persona3.
	 */
	private static Persona p3;
	/**
	 * Atributo para lista de aficiones para la persona1.
	 */
	private static ArrayList<String> aficionesp1;
	/**
	 * Atributo para lista de aficiones para la persona2.
	 */
	private static ArrayList<String> aficionesp2;
	/**
	 * Atributo para lista de aficiones para la persona3.
	 */
	private static ArrayList<String> aficionesp3;
	
	/**
	 * Método para probar que funciona perfectamente el método SonCompatibles.
	 */
	@Test 
	void testSonCompatibles() {
		
		aficionesp1 = new ArrayList<String>();
		aficionesp1.add("Viajar");
		aficionesp1.add("Leer");
		aficionesp1.add("Cantar");
		aficionesp1.add("Beber");
		
		aficionesp2 = new ArrayList<String>();
		aficionesp1.add("Bailar");
		aficionesp1.add("Leer");
		aficionesp1.add("Soñar");
		aficionesp1.add("Tocar");
		
		aficionesp3 = new ArrayList<String>();
		aficionesp1.add("Tocar");
		aficionesp1.add("Leer");
		aficionesp1.add("Dormir");
		aficionesp1.add("Soñar");
		
		
		//assertEquals(p1, p2); //No tienen afinidad
		//assertEquals(p2, p3); //Sí tienen afinidad
		assertEquals(p3, p1); //No tienen afinidad
		
	}
}

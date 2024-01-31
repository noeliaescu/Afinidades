
import java.text.Normalizer;
import java.util.*;

/**
 * <h2>Clase MiProgramaMain</h2> Esta clase nos indica la compatibilidad de las
 * personas dependiendo de sus aficiones.
 * 
 * @author Noelia
 * @author Gracia
 *
 */

public class MiProgramaMain {
	

	final static private int NUMPERSONAS = 10; // Constante control de personas que creamos.
	final static private int NUMAFICIONES = 7; // Constante control de aficiones que creamos.
	static Scanner tec = new Scanner(System.in);

	/**
	 * 
	 * @param aficion Afición que nos pasa una persona.
	 * @return Devuelve la afición sin caracteres problematicos, una cadena limpia.
	 */
	
	public static String limpiaTexto(String aficion) {
		aficion = Normalizer.normalize(aficion, Normalizer.Form.NFD);
		aficion = aficion.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		return aficion;
	}

	/**
	 * Le pasamos un ArrayList de personas y lo rellenamos y lo rellenamos creando
	 * varios objetos de la clase persona.
	 * 
	 * @param persona Lista de personas que meten los datos en el programa.
	 */
	public static void agregaPersonas(ArrayList<Persona> persona) {
		String afi;
		String nombre;
		int edad=0;
		for (int x = 0; x < NUMPERSONAS; x++) {
			System.out.println("Introduce tu nombre: ");
			nombre = tec.nextLine();
			edadPersona(edad);
			System.out.println("Y, finalmente, " + NUMAFICIONES + " aficiones definiéndolos con 1 palabra: ");
			ArrayList<String> aficiones = new ArrayList<String>(NUMAFICIONES);
			for (int i = 0; i <= NUMAFICIONES; i++) {
				afi = tec.nextLine();
				aficiones.add(afi = limpiaTexto(afi.toLowerCase()));
			}
			persona.add((new Persona(nombre, edad, aficiones)));
		}
	}
	
	/**
	 * Le pasamos la edad que introduzca la persona para asegurarnos de que meta una edad válida y que sea mayor de edad.
	 * 
	 * @param edad La edad que introduce la persona.
	 */
	public static void edadPersona (int edad) {
		boolean repetir=true; 
		do {
			System.out.println("Introduce tu edad: ");
			try {
				edad = tec.nextInt();
				repetir=false;
				if (edad<18) {
					System.out.println("Introduce una edad válida.");
					repetir=true;
				}
			} catch (InputMismatchException e1) {
				tec.nextLine();
				System.out.println("Introduce una edad válida.");	
			}
		} while (repetir);
	}

	/**
	 * Recorre las aficiones de dos personas y si tienen 3 o más en común se añaden
	 * el uno al otro a su propio ArrayList de personasCompatibles mediante el
	 * método agregarPersonaCommpatible.
	 * 
	 * @param persona1 Persona que guarda sus datos.
	 * @param persona2 Siguiente persona que guarda sus datos.
	 */
	public static void sonCompatibles(Persona persona1, Persona persona2) {
		int coincidencias = 0; // Variable contador de aficiones iguales.
		for (int i = 0; i < persona1.getAficiones().size(); i++) {
			if (persona2.getAficiones().contains(persona1.getAficiones().get(i))) {
				coincidencias++;
			}
		}
		if (coincidencias >= 3) {
			persona1.agregarPersonaCompatible(persona2);
			persona2.agregarPersonaCompatible(persona1);
		}
	}

	/**
	 * Se le pasa el ArrayList de personas ya llenado y se va comprobando la
	 * compatibilidad mediante el método sonCompatibles.
	 * 
	 * @param personas Lista de personas que meten los datos en el programa.
	 */
	public static void comparaAficiones(ArrayList<Persona> personas) {
		for (int i = 0; i < personas.size(); i++) {
			for (int j = i + 1; j < personas.size(); j++) {
				sonCompatibles(personas.get(i), personas.get(j));
			}
		}
	}

	/**
	 * Se le pasa el ArrayList de personas y muestra el ArrayList
	 * personasCompatibles de cada persona.
	 * 
	 * @param personas Lista de personas que meten los datos en el programa.
	 */
	public static void mostrarResultados(ArrayList<Persona> personas) {
		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).getPersonasCompatibles().isEmpty()) {
				System.out.println(personas.get(i) + " no es afín con nadie del programa.");
			} else {
				System.out.println(personas.get(i) + " es afín con " + personas.get(i).getPersonasCompatibles());

			}
		}
	}

	/**
	 * Programa principal.
	 * 
	 * @param args Se crea el ArrayList personas y se le pasa a los métodos
	 *             pertinentes para que se desarrolle el programa.
	 */
	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		agregaPersonas(personas);
		comparaAficiones(personas);
		mostrarResultados(personas);
	}
}

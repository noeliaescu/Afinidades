import java.util.ArrayList;

/**
 * <h2> Clase Persona </h2>
 * Esta clase crea el objeto Persona.
 * 
 * @author Noelia
 * @author Gracia
 * 
 */

public class Persona {
	
	/**
	 * Atributo que indica el nombre de la persona.
	 */
	protected String nombre;
	/**
	 * Atributo que indica la edad de la persona.
	 */
	protected int edad;
	/**
	 * Atributo que indica las aficiones de la persona.
	 */
	protected ArrayList<String> aficiones;
	/**
	 * Atributo que indica las personas compatibles con la persona.
	 */
	protected ArrayList<Persona> personasCompatibles = new ArrayList<Persona>();
	
	/**
	 * 
	 * @param NombreInicial Nombre de la persona.
	 * @param EdadInicial Edad de la persona.
	 * @param aficionesIniciales Lista de aficiones de la persona.
	 */
	
	public Persona(String NombreInicial, int EdadInicial, ArrayList<String> aficionesIniciales){
		setNombre(NombreInicial);
		setEdad(EdadInicial);
		setAficiones(aficionesIniciales);
		
	}
	
	/**
	 * 
	 * @return Devuelve el nombre de la persona.
	 */
	
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @return Devuelve la edad de la persona.
	 */
	
	public int getEdad() {
		return edad;
	}

	/**
	 * 
	 * @return Devuelve una lista de aficiones de la persona.
	 */
	
	public ArrayList<String> getAficiones() {
		return aficiones;
	}
	
	/**
	 * 
	 * @return Devuelve una lista de las personas compatibles de la persona.
	 */
	
	public ArrayList<Persona> getPersonasCompatibles() {
		return personasCompatibles;
	}
	
	/**
	 * 
	 * @param name Nombre de la persona.
	 */
	
	public void setNombre(String name) {
		this.nombre = name;
	}

	/**
	 * 
	 * @param edad Edad de la persona.
	 */
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
	
	/**
	 * 
	 * @param aficiones Lista de aficiones de la persona.
	 */
	
	public void setAficiones(ArrayList<String> aficiones) {
		this.aficiones = aficiones;
	}

	/**
	 * 
	 * @param personasCompatibles Lista de las personas compatibles con la persona.
	 */
	
	public void setPersonasCompatibles(ArrayList<Persona> personasCompatibles) {
		this.personasCompatibles = personasCompatibles;
	}
	
	/**
	 * Se van agregando las personas al ArrayList de personasCompatibles.
	 * @param persona Persona que es compatible.
	 */
	public void agregarPersonaCompatible(Persona persona) {
		this.personasCompatibles.add(persona);
		
	}

	/**
	 * @return Devuelve el nombre de la persona.
	 */
	
	@Override
	public String toString() {
		return nombre;
	}
}

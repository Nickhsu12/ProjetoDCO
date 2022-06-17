package Migrantes;

public class Migrante {

	private String name;
	private int numero;
	
	public Migrante ( String name ) {
		this.name = name;
	}
	
	public Migrante( String name, int numero) {
		this.name = name;
		this.numero = numero;
	}
	
	public String toString() {
		if ( numero == 0 ) {
			return ( name + "\n");
		} else {
			return ("Nome: " + name + "\n" + "Número: " + numero + "\n");
		}
	}
}

package Migrantes;

import java.util.ArrayList;
import java.util.List;

public class Familia {
 
	private List<Migrante> listaMigrantes;
	private int numeroMigrantes;
	
	public Familia(int numeroMigrantes ) {
		this.numeroMigrantes = numeroMigrantes;
		this.listaMigrantes = new ArrayList<Migrante>();
	}
	
	public void addMembros ( String nome) {
		listaMigrantes.add(new Migrante(nome));
	}
	
}

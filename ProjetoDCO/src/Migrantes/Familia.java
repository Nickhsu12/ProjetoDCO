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
	
	public String toString() {
		StringBuilder s = new StringBuilder("");
		s.append("Número de membros : " + numeroMigrantes + "\n" );
		s.append("Lista de membros: \n");
		for ( Migrante membros : listaMigrantes) {
			s.append(membros.toString());
		}
		return s.toString();
	}
}

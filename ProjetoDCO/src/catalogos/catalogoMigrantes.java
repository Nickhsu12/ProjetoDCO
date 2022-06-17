package catalogos;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import Migrantes.Familia;
import Migrantes.FamiliaHandler;
import Migrantes.Migrante;

public class catalogoMigrantes {
	
	private LinkedHashMap< Migrante , Familia > listaMigrantes;
	
	public catalogoMigrantes() {
		/* Lista de migrantes com o migrante "cabeça" como chave*/
		this.listaMigrantes = new LinkedHashMap< Migrante, Familia>(); 
	}
	
	public void addMigrante(String nome, int numero) {
		Migrante migrante = new Migrante(nome, numero);
		Familia familia = new Familia(0);		
		listaMigrantes.put(migrante, familia);
	}
	
	public void addFamilia( Migrante migrante, Familia familia) {
		listaMigrantes.put(migrante, familia);
	}
}

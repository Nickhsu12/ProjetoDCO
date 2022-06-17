package catalogos;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import Handlers.FamiliaHandler;
import Migrantes.Familia;
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
	
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		for( Map.Entry<Migrante, Familia> migrante : listaMigrantes.entrySet()) {
			sb.append(migrante.getKey().toString() + migrante.getValue().toString() + "\n");
		}
		return sb.toString();
	}
}

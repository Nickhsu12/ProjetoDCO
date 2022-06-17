package Migrantes;

import java.util.List;

public class FamiliaHandler {
	
	public Familia createFamilia(int numMigrantes, List<String> familia ) {
		Familia familiaMigrantes = new Familia(numMigrantes);
		for ( String nomeDoMigrante : familia ) {
			familiaMigrantes.addMembros(nomeDoMigrante);
		}
		return familiaMigrantes;
	}
}

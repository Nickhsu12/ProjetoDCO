package sistema;

import Handlers.IdentificarHandler;
import identidades.Ajuda;
import identidades.CatAjudas;
import identidades.CatVoluntarios;

public class MigrantMatcher {
	private CatVoluntarios catVoluntarios;
	private CatAjudas catAjudas;

	public IdentificarHandler getIdentificarHandler() {
		return new IdentificarHandler(catVoluntarios);
	}

	public MigrantMatcher() {
		this.catVoluntarios = new CatVoluntarios();
		this.catAjudas = new CatAjudas();
	}

	public void addVoluntario(int i) {
		if (catVoluntarios.exists(i)) {
			System.out.println("Existe esse voluntario no nosso sistema");
			return;
		}
		catVoluntarios.put(i);
	}

	public void addAjuda(Ajuda a) {
		catAjudas.addAjuda(a);
	}
}

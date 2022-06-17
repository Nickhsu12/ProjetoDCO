package sistema;

import Handlers.IdentificarHandler;
import catalogos.CatAjudas;
import catalogos.CatVoluntarios;
import identidades.Ajuda;

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

	public void addVoluntario(String num) {
		if (catVoluntarios.exists(num)) {
			System.out.println("Existe esse voluntario no nosso sistema");
			return;
		}
		catVoluntarios.put(num);
	}

	public void addAjuda(Ajuda a) {
		catAjudas.addAjuda(a);
	}

	public Boolean containsVoluntario(String num) {
		return this.catVoluntarios.exists(num);
	}

	public Boolean containsAjuda(int id) {
		return this.catAjudas.exists(id);
	}
}

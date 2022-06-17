package Handlers;

import catalogos.CatVoluntarios;
import identidades.Voluntario;

public class IdentificarHandler {

	private CatVoluntarios catVoluntarios;

	public IdentificarHandler(CatVoluntarios catVoluntarios) {
		this.catVoluntarios = catVoluntarios;
		catVoluntarios.put("918629958");
	}

	public Voluntario identCont(String i) {
		if (!catVoluntarios.exists(i)) {
			System.out.println("Não existe esse voluntario no nosso sistema");
			System.exit(0);
		}
		return catVoluntarios.getVoluntario(i);

	}
}

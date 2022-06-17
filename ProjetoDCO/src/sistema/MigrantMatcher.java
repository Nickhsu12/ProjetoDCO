package sistema;

import identidades.catVoluntarios;

public class MigrantMatcher {
	private catVoluntarios catVoluntarios;

	public MigrantMatcher() {
		this.catVoluntarios = new catVoluntarios();
	}

	public void identCont(int i) {
		while (!catVoluntarios.exists(i)) {
			System.out.println("Não existe esse voluntario no nosso sistema");
		}
		System.out.println("Entrou com sucesso!");

	}

	public void addVoluntario(int i) {
		if (catVoluntarios.exists(i)) {
			System.out.println("Existe esse voluntario no nosso sistema");
			return;
		}
		catVoluntarios.put(i);
	}
}

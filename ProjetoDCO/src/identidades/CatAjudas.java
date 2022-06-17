package identidades;

import java.util.ArrayList;
import java.util.List;

public class CatAjudas {
	private List<Ajuda> catAjudas;

	public CatAjudas() {
		this.catAjudas = new ArrayList<>();
	}

	public void addAjuda(Ajuda a) {
		catAjudas.add(a);
	}

}

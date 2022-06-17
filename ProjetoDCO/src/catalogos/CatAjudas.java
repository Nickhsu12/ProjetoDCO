package catalogos;

import java.util.ArrayList;
import java.util.List;

import identidades.Ajuda;

public class CatAjudas {
	private List<Ajuda> catAjudas;

	public CatAjudas() {
		this.catAjudas = new ArrayList<>();
	}

	public void addAjuda(Ajuda a) {
		catAjudas.add(a);
	}

	public Boolean exists(int id) {
		return null;
	}

}

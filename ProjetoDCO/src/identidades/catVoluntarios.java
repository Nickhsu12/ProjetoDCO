package identidades;

import java.util.ArrayList;
import java.util.List;

public class catVoluntarios {
	private List<Voluntario> listaVoluntarios;

	public catVoluntarios() {
		this.listaVoluntarios = new ArrayList<>();
	}

	public Boolean exists(int i) {
		for (Voluntario v : this.listaVoluntarios) {
			if (v.getContacto() == i) {
				return true;
			}
		}
		return false;
	}

	public void put(int i) {
		Voluntario toAdd = new Voluntario(i);
		listaVoluntarios.add(toAdd);

	}
}

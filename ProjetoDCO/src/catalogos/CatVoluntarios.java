package catalogos;

import java.util.ArrayList;
import java.util.List;

import identidades.Voluntario;

public class CatVoluntarios {
	private List<Voluntario> listaVoluntarios;

	public CatVoluntarios() {
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

	public Voluntario getVoluntario(int i) {
		for (Voluntario v : this.listaVoluntarios) {
			if (v.getContacto() == i) {
				return v;
			}
		}
		return null;
	}
}

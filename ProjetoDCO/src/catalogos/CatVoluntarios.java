package catalogos;

import java.util.ArrayList;
import java.util.List;

import identidades.Voluntario;

public class CatVoluntarios {
	private List<Voluntario> listaVoluntarios;

	public CatVoluntarios() {
		this.listaVoluntarios = new ArrayList<>();
	}

	public Boolean exists(String num) {
		for (Voluntario v : this.listaVoluntarios) {
			if (v.getContacto().equals(num)) {
				return true;
			}
		}
		return false;
	}

	public void put(String num) {
		Voluntario toAdd = new Voluntario(num);
		listaVoluntarios.add(toAdd);

	}

	public Voluntario getVoluntario(String num) {
		for (Voluntario v : this.listaVoluntarios) {
			if (v.getContacto().equals(num)) {
				return v;
			}
		}
		return null;
	}
}

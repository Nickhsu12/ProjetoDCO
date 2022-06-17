package Handlers;

import identidades.Ajuda;

public abstract class AjudaHandler {
	protected Ajuda ajuda;
	public int code = 1234;

	public Boolean verifCode(int verif) {
		return verif == this.code;
	}

	public Ajuda getAjuda() {
		return this.ajuda;
	}
}

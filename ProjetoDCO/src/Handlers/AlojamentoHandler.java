package Handlers;

import identidades.Alojamento;
import identidades.Regiao;

public class AlojamentoHandler extends AjudaHandler {
	private Alojamento alojamento;

	public void numRes(int num) {
		Alojamento toAdd = new Alojamento();
		toAdd.setNumPessoas(num);
		this.alojamento = toAdd;
	}

	public void indicaRegAloj(Regiao reg) {
		this.alojamento.setRegiao(reg);
		this.ajuda = alojamento;
	}
}

package identidades;

import Handlers.AlojamentoHandler;

public class Alojamento extends Ajuda {
	private int numPessoas;
	private Regiao regiao;

	public AlojamentoHandler getAlojamentoHandler() {
		return new AlojamentoHandler();
	}

	public int getNumPessoas() {
		return numPessoas;
	}

	public void setNumPessoas(int numPessoas) {
		this.numPessoas = numPessoas;
	}

	public Regiao getRegiao() {
		return regiao;
	}

	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

}

package identidades;

import Handlers.ItemHandler;

public class Item extends Ajuda {

	private String descricao;

	public ItemHandler getItemHandler() {
		return new ItemHandler();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

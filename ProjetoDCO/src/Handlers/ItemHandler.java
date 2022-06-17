package Handlers;

import identidades.Item;

public class ItemHandler extends AjudaHandler {

	public void indicaItem(String desc) {
		Item item = new Item();
		item.setDescricao(desc);
		this.ajuda = item;
	}

}

package testes;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Handlers.AjudaHandler;
import Handlers.ItemHandler;
import identidades.Item;
import main.Main;
import sistema.MigrantMatcher;

class TestesJUnit {

	@Test
	void VoluntarioAddingTest() {
		String num = "912324212";
		MigrantMatcher mm = new MigrantMatcher();
		mm.addVoluntario(num);
		assertEquals(true, mm.containsVoluntario(num));

	}

	@Test
	void AjudaAddingTest() {
		String desc = "Casaco";
		ItemHandler itemHandler = new Item().getItemHandler();
		MigrantMatcher mm = new MigrantMatcher();
		itemHandler.indicaItem(desc);
		AjudaHandler ajudaHandler = itemHandler;
		Main.verificarCodigo("912345678", ajudaHandler, mm);
		assertEquals(true, ajudaHandler.getAjuda().getId());
	}

}

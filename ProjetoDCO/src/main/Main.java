package main;

import java.util.Random;
import java.util.Scanner;

import com.pidgeonsmssender.sdk.PidgeonSMSSender;

import Handlers.AjudaHandler;
import Handlers.AlojamentoHandler;
import Handlers.IdentificarHandler;
import Handlers.ItemHandler;
import identidades.Alojamento;
import identidades.Item;
import identidades.Regiao;
import sistema.MigrantMatcher;

public class Main {
	public static void main(String[] args) {
		PidgeonSMSSender a = new PidgeonSMSSender();
		a.send("918629958", "oi");
		Scanner scan = new Scanner(System.in);
		MigrantMatcher mm = new MigrantMatcher();
		IdentificarHandler identificarHandler = mm.getIdentificarHandler();
		// registar ajuda
		System.out.println("Identifique se como voluntario");
		int numId = scan.nextInt();
		identificarHandler.identCont(numId);

		Random r = new Random();

		AjudaHandler ajudaHandler;

		if (r.nextBoolean()) {
			Regiao reg = new Regiao("Lisboa");
			AlojamentoHandler alojamentoHandler = new Alojamento().getAlojamentoHandler();
			alojamentoHandler.numRes(r.nextInt(3) + 1);
			alojamentoHandler.indicaRegAloj(reg);
			ajudaHandler = alojamentoHandler;
		} else {

			String desc = "Casaco";
			ItemHandler itemHandler = new Item().getItemHandler();
			itemHandler.indicaItem(desc);
			ajudaHandler = itemHandler;
		}

		if (ajudaHandler.verifCode(1234)) {
			mm.addAjuda(ajudaHandler.getAjuda());
		}
		scan.close();
	}
}

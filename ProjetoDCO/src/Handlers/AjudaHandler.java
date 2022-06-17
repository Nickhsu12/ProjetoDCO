package Handlers;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import identidades.Ajuda;

public abstract class AjudaHandler {
	protected Ajuda ajuda;
	public String code;

	public Boolean verifCode() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduza o código de verificação: ");
		try {
			String verif = scan.next();
			scan.close();
			return verif.equals(this.code);
		} catch (InputMismatchException e) {
			System.out.println("Introduziu algo inesperado!");
			return null;
		}

	}

	public Ajuda getAjuda() {
		return this.ajuda;
	}

	public String generateCode() {
		Random random = new Random();
		String code = String.format("%04d", random.nextInt(10000));
		this.code = code;
		return code;
	}
}

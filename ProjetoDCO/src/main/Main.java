package main;

import java.util.Scanner;

import sistema.MigrantMatcher;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MigrantMatcher mm = new MigrantMatcher();
		mm.addVoluntario(918629958);
		// registar ajuda
		System.out.println("Identifique se como voluntario");
		int numId = scan.nextInt();

		mm.identCont(numId);
		scan.close();
	}
}

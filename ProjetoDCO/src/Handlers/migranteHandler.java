package Handlers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

import Migrantes.Familia;
import Migrantes.Migrante;
import catalogos.catalogoMigrantes;

public class migranteHandler {

	private catalogoMigrantes catalogoMigrantes;
	private FamiliaHandler familiaHandler;
	private Scanner sc;
	
	/*
	 * Construtor para o migranteHandler
	 */
	public migranteHandler() {
		this.catalogoMigrantes = new catalogoMigrantes(); 
		this.familiaHandler = new FamiliaHandler();
		this.sc = new Scanner(System.in);
	}
	
	/*
	 * Adciona um migrante ao catalogo
	 * @param nome
	 */
	public void adicionarCatalogoMigrante(String nome, int numero) {
		catalogoMigrantes.addMigrante(nome, numero);
	}
	
	/*
	 * Adiciona um migrante e a sua familia ao catalogo
	 * @param cabeça
	 * @param membros
	 * @param numeroMembros
	 */
	public void adcionarCatalogoFamilia(Migrante cabeça, Familia familia) {
		catalogoMigrantes.addFamilia(cabeça, familia);
	}

	
	/*
	 * 
	 */
	public void pedirMigrante() {
        System.out.println("Digite o seu nome: ");
        String nome = sc.next();

        System.out.println("Digite o seu número: ");
        int numero = sc.nextInt();

        adicionarCatalogoMigrante(nome, numero);
        sc.close();
	}

	
	/*
	 * 
	 */
	public void pedirFamilia() {
		List<String> listaMembros = new ArrayList<String>();
		
		System.out.println("Digite o seu nome: ");
		String nome = sc.next();
		
		System.out.println("Digite o seu número: ");
		int numero = sc.nextInt();
		
		System.out.println("Digite o número de membros da familia: ");
		int membros = sc.nextInt();
		
		Familia familia = new Familia(membros);
		
		System.out.println("Digite o nome de cada membro da familia: ");
		for ( int i = 0; i < membros ; i++ ) {
			familia.addMembros(sc.next());
		}
		
		adcionarCatalogoFamilia(new Migrante(nome, numero), familia);
		sc.close();
		
	}
	
	public String toString() {
		return catalogoMigrantes.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

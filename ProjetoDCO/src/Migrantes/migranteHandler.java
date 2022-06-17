package Migrantes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import catalogos.catalogoMigrantes;

public class migranteHandler {

	private catalogoMigrantes catalogoMigrantes;
	private FamiliaHandler familiaHandler;
	
	/**
	 * Construtor para o migranteHandler
	 */
	public migranteHandler() {
		this.catalogoMigrantes = new catalogoMigrantes(); 
		this.familiaHandler = new FamiliaHandler();
	}
	
	/**
	 * Adciona um migrante ao catalogo
	 * @param nome
	 */
	public void adicionarCatalogoMigrante(String nome, int numero) {
		catalogoMigrantes.addMigrante(nome, numero);
	}
	
	/**
	 * Adiciona um migrante e a sua familia ao catalogo
	 * @param cabeça
	 * @param membros
	 * @param numeroMembros
	 */
	public void adcionarCatalogoFamilia(Migrante cabeça, ArrayList<String> membros, int numeroMembros) {
		catalogoMigrantes.addFamilia(cabeça, familiaHandler.createFamilia(numeroMembros, membros));
	}
}

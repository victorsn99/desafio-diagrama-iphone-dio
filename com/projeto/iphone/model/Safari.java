package com.projeto.iphone.model;

import com.projeto.iphone.interfaces.NavegadorInternet;

public class Safari implements NavegadorInternet {


	/**
	 * @see NavegadorInternet#exibirPagina()
	 */
	public void exibirPagina() {
		System.out.println("Exibindo Página...");
	}


	/**
	 * @see NavegadorInternet#adicionarNovaAba()
	 */
	public void adicionarNovaAba() {
		System.out.println("Abrindo Nova Aba...");
	}


	/**
	 * @see NavegadorInternet#atualizarPagina()
	 */
	public void atualizarPagina() {
		System.out.println("Atualizando Página...");
	}

}

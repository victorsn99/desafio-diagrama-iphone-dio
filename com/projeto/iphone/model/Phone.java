package com.projeto.iphone.model;

import com.projeto.iphone.interfaces.AparelhoTelefonico;

public class Phone implements AparelhoTelefonico {


	/**
	 * @see AparelhoTelefonico#ligar()
	 */
	public void ligar() {
		System.out.println("Ligando para um contato...");
	}


	/**
	 * @see AparelhoTelefonico#atender()
	 */
	public void atender() {
		System.out.println("Atendendo uma ligação...");
	}


	/**
	 * @see AparelhoTelefonico#iniciarCorreioVoz()
	 */
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz...");
	}

}

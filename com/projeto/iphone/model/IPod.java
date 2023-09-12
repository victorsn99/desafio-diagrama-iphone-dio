package com.projeto.iphone.model;

import com.projeto.iphone.interfaces.ReprodutorMusical;

public class IPod implements ReprodutorMusical {


	/**
	 * @see ReprodutorMusical#tocar()
	 */
	public void tocar() {
		System.out.println("Tocando música...");
	}


	/**
	 * @see ReprodutorMusical#pausar()
	 */
	public void pausar() {
		System.out.println("Pausando música...");
	}


	/**
	 * @see ReprodutorMusical#selecionarMusica()
	 */
	public void selecionarMusica() {
		System.out.println("Selecionando música...");
	}

}

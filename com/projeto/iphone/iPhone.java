package com.projeto.iphone;

import com.projeto.iphone.model.IPod;
import com.projeto.iphone.model.Phone;
import com.projeto.iphone.model.Safari;

public class iPhone {

	public static void main(String[] args) {
		IPod ipod = new IPod();
		Phone phone = new Phone();
		Safari safari = new Safari();

		// Métodos iPod
		ipod.selecionarMusica();
		ipod.tocar();
		ipod.pausar();

		// Métodos Telefone
		phone.iniciarCorreioVoz();
		phone.ligar();
		phone.atender();

		// Métodos Safari
		safari.adicionarNovaAba();
		safari.exibirPagina();
		safari.atualizarPagina();

	}

}

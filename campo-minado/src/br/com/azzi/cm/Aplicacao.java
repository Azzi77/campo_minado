package br.com.azzi.cm;

import br.com.azzi.cm.modelo.Tabuleiro;
import br.com.azzi.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main (String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		new TabuleiroConsole(tabuleiro);
		
	}

}

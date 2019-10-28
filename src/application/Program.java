package application;

import xadrez.PartidaXadrez;

public class Program {

	public static void main(String[] args) {
		PartidaXadrez partidaxadrez = new PartidaXadrez();
		UI.imprimeTabuleiro(partidaxadrez.getPecas());
	}
	
	

}

package application;


import xadrez.PecaXadrez;

public class UI {
	
	public static void imprimeTabuleiro(PecaXadrez[][] pecas) {
		for (int linha = 0 ; linha < pecas.length; linha++) {
			System.out.print((8-linha) + " ");
			
			for(int coluna = 0 ; coluna < pecas.length; coluna++) {
			imprimePeca(pecas[linha][coluna]);	
			}
			System.out.println();
		}
		System.out.print("  a b c d e f g h");
	}
	
	public static void imprimePeca(PecaXadrez peca) {
		if(peca == null) {
			System.out.print("-");
		}else{
			System.out.print(peca);
		}
		System.out.print(" ");
	}

}

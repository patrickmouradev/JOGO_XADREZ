package xadrez;

import jogotabuleiro.Posicao;
import jogotabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro (8,8);
		inicioPartida() ;
	}
	
	public PecaXadrez [][] getPecas(){
		PecaXadrez [][]  mat = new PecaXadrez [tabuleiro.getLinhas()][tabuleiro.getColunas()]; 
		for (int linha = 0; linha < tabuleiro.getLinhas(); linha++) {
			for (int coluna = 0; coluna < tabuleiro.getColunas(); coluna++) {
				mat [linha][coluna] = (PecaXadrez) tabuleiro.peca(linha, coluna);
			}
		}
		return mat;
	}

	
	private void inicioPartida() {
		tabuleiro.colocarPeca(new Torre(tabuleiro,Cor.branco), new Posicao(2, 1) );
		tabuleiro.colocarPeca(new Rei(tabuleiro,Cor.branco), new Posicao(0, 4) );
		tabuleiro.colocarPeca(new Rei(tabuleiro,Cor.preto), new Posicao(7, 4) );
	}
}

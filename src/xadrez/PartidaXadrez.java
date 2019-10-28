package xadrez;

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

	private void colocarNovaPeca(char coluna, int linha, PecaXadrez peca ) {
		tabuleiro.colocarPeca(peca, new posicaoXadrez(coluna, linha).toPosicao());
	}
	
	private void inicioPartida() {
		colocarNovaPeca('b', 6, new Torre(tabuleiro,Cor.branco) );
		colocarNovaPeca('e', 8, new Rei(tabuleiro,Cor.branco) );
		colocarNovaPeca('e', 1, new Rei(tabuleiro,Cor.preto) );
	}
}

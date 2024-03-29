package xadrez;

import jogotabuleiro.Posicao;

public class posicaoXadrez {

	private char coluna;
	private int linha;

	public posicaoXadrez(char coluna, int linha) {
		if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new ExcessoesXadrez("Erro na instacia��o da Posi��oXadrez. Posi��es valida de a1 at� h8.");
		}
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}

	protected Posicao toPosicao() {
		return new Posicao(8 - linha, coluna - 'a');
	}

	protected static posicaoXadrez fromPosicao(Posicao posicao) {
		return new posicaoXadrez((char) ('a' - posicao.getColuna()), 8 - posicao.getLinha());
	}

	@Override
	public String toString() {
		return "" + coluna + linha;
	}
}

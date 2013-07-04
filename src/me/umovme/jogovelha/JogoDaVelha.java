package me.umovme.jogovelha;

public class JogoDaVelha {

	private final String[][] tabuleiro;

	public JogoDaVelha(String[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public Boolean jogar(int i, int j, String jogador) {
		try {
			if (tabuleiro[i][j] != null)
				return false;

			tabuleiro[i][j] = jogador;
			return true;
		} catch (IndexOutOfBoundsException ex) {
			return false;
		}
	}

}

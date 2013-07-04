package me.umovme.jogovelha;

public class Tabuleiro {

	private final String[][] casas = new String[3][3];

	public Boolean jogar(int i, int j, String jogador) {
		casas[i][j] = jogador;
		return true;
	}

}

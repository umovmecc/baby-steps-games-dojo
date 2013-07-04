package me.umovme.jogovelha;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class JogoDaVelhaTest {
	@Test
	public void deveRetornarTrueQuandoJogadaValida() {
		Tabuleiro tabuleiro = new Tabuleiro();
		assertTrue(tabuleiro.jogar(1, 1));

	}
}

package me.umovme.jogovelha;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class JogoDaVelhaTest {
	@Test
	public void deveRetornarTrueQuandoJogadaValida() {
		Tabuleiro tabuleiro = new Tabuleiro();
		assertTrue(tabuleiro.jogar(1, 1, "O"));
	}

	@Test
	public void deveRetornarFalsoQuandoJogadaInvalidaForaDoTabuleiro() {
		Tabuleiro tabuleiro = new Tabuleiro();
		assertFalse(tabuleiro.jogar(4, 5, "X"));
	}
}

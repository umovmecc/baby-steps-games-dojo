package me.umovme.jogovelha;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class JogoDaVelhaTest {

	private JogoDaVelha jogoDaVelha;

	@Before
	public void setUp() {
		jogoDaVelha = new JogoDaVelha();
	}

	@Test
	public void deveRetornarTrueQuandoJogadaValida() {
		assertTrue(jogoDaVelha.jogar(1, 1, "O"));
	}

	@Test
	public void deveRetornarFalsoQuandoJogadaInvalidaForaDoTabuleiro() {
		assertFalse(jogoDaVelha.jogar(4, 5, "X"));
	}

	@Test
	public void deveRetornarFalsoQuandoJogarEmUmaJogadaExistente() {
		jogoDaVelha.jogar(1, 1, "O");
		assertFalse(jogoDaVelha.jogar(1, 1, "X"));
	}

}

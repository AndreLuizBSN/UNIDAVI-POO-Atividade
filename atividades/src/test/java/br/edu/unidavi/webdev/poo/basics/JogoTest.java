package br.edu.unidavi.webdev.poo.basics;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class JogoTest {

	@Test
	public void testGetWrongsUm() {
		Passe passe = new Passe("Ghost");
		Jogo jogo = new Jogo(passe);
		jogo.jogada(passe.initPlaceholder(), "r");
		int wrongs = jogo.getWrongs();
		Assert.assertEquals(0, wrongs);
	}

	@Test
	public void testGetWrongsZero() {
		Passe passe = new Passe("Ghost");
		Jogo jogo = new Jogo(passe);
		jogo.jogada(passe.initPlaceholder(), "G");
		int wrongs = jogo.getWrongs();
		Assert.assertEquals(0, wrongs);
	}

	@Test
	public void testGetLimit() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPlaceholderAsString() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsCanPlay() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsGotcha() {
		fail("Not yet implemented");
	}

}

package br.edu.unidavi.webdev.poo.basics;


import org.junit.Test;
import org.junit.Assert;

public class PasseTest {

	@Test
	public void capturarPass(){
		Passe passe = new Passe("instanceof");
		String pass = passe.getPass();
		Assert.assertEquals("instanceof", pass);
	}
	
	@Test
	public void verificarPlaceholder(){
		Passe passe = new Passe("instanceof");
		String pass = String.valueOf(passe.initPlaceholder());
		Assert.assertEquals("**********", pass);
	}

}

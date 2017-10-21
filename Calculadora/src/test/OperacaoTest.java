package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import calc.Operacao;

public class OperacaoTest {

	@Test
	public void testSoma() {
		Operacao op = new Operacao(1,2);
		int soma = op.soma();
		Assert.assertEquals(3, soma);
	}

	@Test
	public void testMultiplica() {
		Operacao op = new Operacao(3,2);
		int nr = op.multiplica();
		Assert.assertEquals(6, nr);
	}

	@Test
	public void testDivide() {
		Operacao op = new Operacao(3,2);
		double nr = op.divide();
		Assert.assertSame(1.5, nr);
	}

	@Test
	public void testSubtrai() {
		Operacao op = new Operacao(3,2);
		int soma = op.subtrai();
		Assert.assertEquals(1, soma);
	}
	

}

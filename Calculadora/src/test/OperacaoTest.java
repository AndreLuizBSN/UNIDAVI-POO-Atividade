package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

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
		Assert.assertEquals(1.5, nr, 0);
	}

	@Test
	public void testSubtrai() {
		Operacao op = new Operacao(3,2);
		int soma = op.subtrai();
		Assert.assertEquals(1, soma);
	}
	
	@Test
	public void testSubtrai2() {
		BigDecimal b = new BigDecimal("2");
		BigDecimal c = new BigDecimal("3");
		Assert.assertEquals(b,c);
	}
	

}

package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import calc.CalcularMultiplicar;

public class CalcularMultiplicarTest {

	@Test
	public void testExec() {
		CalcularMultiplicar c = new CalcularMultiplicar();
		double ret = c.exec(2, 2);
		Assert.assertEquals(4,ret,0);
	}

}

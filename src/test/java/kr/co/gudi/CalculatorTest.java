package kr.co.gudi;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator c;
	int a = 4;
	int b = 2;
	
	@Before
	public void before() {
		System.out.println("before()");
		c = new Calculator();
	}
	
	@Test
	public void test() {
		System.out.println("test()");
		
		int r1 = c.add(a, b);
		int r2 = c.subtract(a, b);
		int r3 = c.multiply(a, b);
		int r4 = c.divide(a, b);
		
		assertEquals(2, r4);
	
	}
	
	@After
	public void after() {
		System.out.println("after()");
	}
}

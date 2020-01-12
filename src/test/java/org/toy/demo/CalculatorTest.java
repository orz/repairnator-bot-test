package org.toy.demo;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testSub() {
		Calculator calc = new Calculator();
		assertEquals(calc.sub(1, 1), 0);
	}
	@Test
	public void testMul() {
		Calculator calc = new Calculator();
		assertEquals(calc.mul(3, 5), 15);
	}
	@Test
	public void testDiv() {
		Calculator calc = new Calculator();
		assertEquals(calc.div(8, 2), 4);
	}
}

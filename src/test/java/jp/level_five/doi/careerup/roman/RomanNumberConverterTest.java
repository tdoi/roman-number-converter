package jp.level_five.doi.careerup.roman;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumberConverterTest {
	
	
	private RomanNumberConverter romanNumberConverter = new RomanNumberConverter();

	public void setUp() {
	}

	@Test
	public void testSingleIShouldBeInterpretedAs1() {
		assertEquals(1, romanNumberConverter.convert("I"));
	}
	
	@Test
	public void testSingleVShouldBeInterpretedAs5() {		
		assertEquals(5, romanNumberConverter.convert("V"));		
	}
	
	@Test
	public void testSingleXShouldBeInterpretedAs10() {		
		assertEquals(10, romanNumberConverter.convert("X"));		
	}
	
	@Test
	public void testSingleLShouldBeInterpretedAs50() {		
		assertEquals(50, romanNumberConverter.convert("L"));		
	}

}

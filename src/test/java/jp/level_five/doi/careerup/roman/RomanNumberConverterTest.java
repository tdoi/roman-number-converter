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

	@Test
	public void testSingleCShouldBeInterpretedAs100() {		
		assertEquals(100, romanNumberConverter.convert("C"));		
	}
	
	@Test
	public void testSingleDShouldBeInterpretedAs500() {
		assertEquals(500, romanNumberConverter.convert("D"));
	}

	@Test
	public void testSingleMShouldBeInterpretedAs1000() {
		assertEquals(1000, romanNumberConverter.convert("M"));
	}
	
	@Test
	public void testSingleSmallIShouldBeInterpretedAs1() {
		assertEquals(1, romanNumberConverter.convert("i"));		
	}
}

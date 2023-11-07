package annatations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestoTest {
private	Testo testo;

	@BeforeEach
	void setUp() {
		
	 testo = new Testo();
	}

	@Test
	void testAdd() {
		int result = testo.add(10, 5);
		assertEquals(15, result);
	}

	@Test
	void testSubtract() {
		int result = testo.subtract(10, 5);
		assertEquals(5, result);
	}

	@Test
	void testMultiply() {
		int result = testo.multiply(10, 5);
		assertEquals(50, result);	}
	//fine

	@Test
	void testDivide() {
		int result = testo.divide(10, 5);
		assertEquals(2, result);	}

}

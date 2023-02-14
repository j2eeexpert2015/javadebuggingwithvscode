package org.debugtutorial.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorUtilTest {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		CalculatorUtil calculatorUtil = new CalculatorUtil();
		assertEquals(2, calculatorUtil.add(1, 1), "1 + 1 should equal 2");
	}

	@Disabled
	@Test
	@DisplayName("Validate Division By Zero ")
	void validateDivision() {
		CalculatorUtil calculatorUtil = new CalculatorUtil();
		assertEquals(2, calculatorUtil.divide(10, 0), "Validate 10/0 ");
	}
}

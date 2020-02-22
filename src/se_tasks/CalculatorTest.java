package se_tasks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() {
	// Arrange
	int a = 10;
	int b = 20;
	Calculator calc = new Calculator();
	// Act
	int result = calc.sum(a, b);
	// Assert
	Assert.assertTrue(result == 30);
	}

}

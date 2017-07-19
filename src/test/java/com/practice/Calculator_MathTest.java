package com.practice;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Calculator_MathTest {
	private Calculator_Math fixture;

	@Before
	public void setUp() {
		fixture = new Calculator_Math();
	}

	@Test
	public void testCaseForAddition() {
		int num1 = 1;
		int num2 = 2;
		int operation = 1;
		int expected = 3;
		int actual = fixture.calculatorMath(num1, num2, CalculatorOperations.get(operation));
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseForSubstraction() {
		int num1 = 1;
		int num2 = 2;
		int operation = 2;
		int expected = -1;
		int actual = fixture.calculatorMath(num1, num2, CalculatorOperations.get(operation));
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseForMultiplication() {
		int num1 = 1;
		int num2 = 2;
		int operation = 3;
		int expected = 2;
		int actual = fixture.calculatorMath(num1, num2, CalculatorOperations.get(operation));
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseForDivision() {
		int num1 = 1;
		int num2 = 2;
		int operation = 4;
		int expected = 0;
		int actual = fixture.calculatorMath(num1, num2, CalculatorOperations.get(operation));
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseForInvalidOperation() {
		int num1 = 1;
		int num2 = 2;
		int operation = 5;
		int expected = 0;
		int actual = fixture.calculatorMath(num1, num2, CalculatorOperations.get(operation));
		assertThat(actual, is(equalTo(expected)));
	}

}

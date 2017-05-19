package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem17_In1020Test {
	private Problem17_In1020 fixture;

	@Before
	public void setUp() {
		fixture = new Problem17_In1020();
	}

	@Test
	public void testCaseFirstNumberIsBtw1020() {
		int num1 = 12;
		int num2 = 99;
		boolean expected = true;
		boolean actual = fixture.in1020(num1, num2);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseSecondNumberIsBtw1020() {
		int num1 = 21;
		int num2 = 12;
		boolean expected = true;
		boolean actual = fixture.in1020(num1, num2);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumberIs10() {
		int num1 = 10;
		int num2 = 10;
		boolean expected = true;
		boolean actual = fixture.in1020(num1, num2);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumberIs20() {
		int num1 = 20;
		int num2 = 20;
		boolean expected = true;
		boolean actual = fixture.in1020(num1, num2);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumberAreBtw1020() {
		int num1 = 12;
		int num2 = 12;
		boolean expected = true;
		boolean actual = fixture.in1020(num1, num2);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumberAreGreaterThan1020() {
		int num1 = 99;
		int num2 = 99;
		boolean expected = false;
		boolean actual = fixture.in1020(num1, num2);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumberAreLessThan1020() {
		int num1 = 8;
		int num2 = 8;
		boolean expected = false;
		boolean actual = fixture.in1020(num1, num2);
		assertThat(actual, is(equalTo(expected)));
	}
}

package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem24_Close10Test {
	private Problem24_Close10 fixture;

	@Before
	public void setUp() {
		fixture = new Problem24_Close10();
	}

	@Test
	public void testCaseFirstNumIsCloseTo10() {
		int a = 9;
		int b = 6;
		int expected = 9;
		int actual = fixture.close10(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseSecondNumIsCloseTo10() {
		int a = 6;
		int b = 9;
		int expected = 9;
		int actual = fixture.close10(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumAreCloseTo10() {
		int a = 9;
		int b = 11;
		int expected = 0;
		int actual = fixture.close10(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumAreEqual() {
		int a = 10;
		int b = 10;
		int expected = 0;
		int actual = fixture.close10(a, b);
		assertThat(actual, is(equalTo(expected)));
	}
}

package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem13_Or35Test {
	private Problem13_Or35 fixture;

	@Before
	public void setUp() {
		fixture = new Problem13_Or35();
	}

	@Test
	public void testCaseWhenNumberIsDivisibleBy3() {
		int n = 3;
		boolean expected = true;
		boolean actual = fixture.or35(n);
		assertThat(actual, is(equalTo(expected)));

	}

	@Test
	public void testCaseWhenNumberIsDivisibleBy5() {
		int n = 10;
		boolean expected = true;
		boolean actual = fixture.or35(n);
		assertThat(actual, is(equalTo(expected)));

	}

	@Test
	public void testCaseWhenNumberIsNotDivisibleBy3() {
		int n = 8;
		boolean expected = false;
		boolean actual = fixture.or35(n);
		assertThat(actual, is(equalTo(expected)));

	}

	@Test
	public void testCaseWhenNumberIsNotDivisibleBy5() {
		int n = 22;
		boolean expected = false;
		boolean actual = fixture.or35(n);
		assertThat(actual, is(equalTo(expected)));

	}

	@Test
	public void testCaseWhenNumberIsZero() {
		int n = 0;
		boolean expected = false;
		boolean actual = fixture.or35(n);
		assertThat(actual, is(equalTo(expected)));

	}

	@Test
	public void testCaseWhenNumberIsNotPositive() {
		int n = 0;
		boolean expected = false;
		boolean actual = fixture.or35(n);
		assertThat(actual, is(equalTo(expected)));

	}
}

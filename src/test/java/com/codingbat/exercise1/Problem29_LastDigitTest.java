package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem29_LastDigitTest {
	private Problem29_LastDigit fixture;

	@Before
	public void setUp() {
		fixture = new Problem29_LastDigit();
	}

	@Test
	public void testCaseBothNumberLastDigitIsSame() {
		int a = 27;
		int b = 17;
		boolean expected = true;
		boolean actual = fixture.lastDigit(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumberAreSame() {
		int a = 27;
		int b = 27;
		boolean expected = true;
		boolean actual = fixture.lastDigit(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumberLastDigitAreDifferent() {
		int a = 28;
		int b = 29;
		boolean expected = false;
		boolean actual = fixture.lastDigit(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumberFirstDigitAreSame() {
		int a = 28;
		int b = 29;
		boolean expected = false;
		boolean actual = fixture.lastDigit(a, b);
		assertThat(actual, is(equalTo(expected)));
	}
}

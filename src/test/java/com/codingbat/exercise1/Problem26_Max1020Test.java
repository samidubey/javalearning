package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem26_Max1020Test {
	private Problem26_Max1020 fixtue;

	@Before
	public void setUp() {
		fixtue = new Problem26_Max1020();
	}

	@Test
	public void testCaseBothNumberBtw1020AndFirstNumberBig() {
		int a = 19;
		int b = 11;
		int expected = 19;
		int actual = fixtue.max1020(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumberBtw1020AndSecondNumberBig() {
		int a = 11;
		int b = 19;
		int expected = 19;
		int actual = fixtue.max1020(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumberBtw1020AndBothAreEqual() {
		int a = 19;
		int b = 19;
		int expected = 19;
		int actual = fixtue.max1020(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumberAreNotInBtw1020() {
		int a = 29;
		int b = 29;
		int expected = 0;
		int actual = fixtue.max1020(a, b);
		assertThat(actual, is(equalTo(expected)));
	}
}

package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem29_EndUpTest {
	private Problem29_EndUp fixture;

	@Before
	public void setUp() {
		fixture = new Problem29_EndUp();
	}

	@Test
	public void testCaseLastThreeCharInCaps() {
		String str = "Hello";
		String expected = "HeLLO";
		String actual = fixture.endUp(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseStrHasOnlyOneChar() {
		String str = "H";
		String expected = "H";
		String actual = fixture.endUp(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseStrHasOnlyTwoChar() {
		String str = "He";
		String expected = "HE";
		String actual = fixture.endUp(str);
		assertThat(actual, is(equalTo(expected)));
	}
}

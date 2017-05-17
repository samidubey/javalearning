package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem14_Front22Test {
	private Problem14_Front22 fixture;

	@Before
	public void setUp() {
		fixture = new Problem14_Front22();
	}

	@Test
	public void testCaseTakeStartingTwoCharAndRepetTheSameFrontAndBack() {
		String str = "kitten";
		String expected = "kikittenki";
		String actual = fixture.Front22(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseTakeStartingTwoCharAndRepetTheSameFrontAndBackWhenStrOnlyTwoChar() {
		String str = "ha";
		String expected = "hahaha";
		String actual = fixture.Front22(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseWhenStrOnlyOneChar() {
		String str = "a";
		String expected = "aaa";
		String actual = fixture.Front22(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseWhenStrIsNull() {
		String str = null;
		String expected = "";
		String actual = fixture.Front22(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseWhenStrIsEmpty() {
		String str = "";
		String expected = "";
		String actual = fixture.Front22(str);
		assertThat(actual, is(equalTo(expected)));
	}
}

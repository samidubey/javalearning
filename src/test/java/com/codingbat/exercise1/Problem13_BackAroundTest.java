package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem13_BackAroundTest {
	private Problem13_BackAround fixture;

	@Before
	public void setUp() {
		fixture = new Problem13_BackAround();
	}

	@Test
	public void testCaseTakeLastCharAndAddItToFront() {
		String str = "cat";
		String expected = "tcatt";
		String actual1 = fixture.backAround(str);
		String actual2 = fixture.backAroundOldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));
	}

	@Test
	public void testCaseTakeLastCharAndAddItToFrontWhenStrHasOnlyTwoChar() {
		String str = "ca";
		String expected = "acaa";
		String actual1 = fixture.backAround(str);
		String actual2 = fixture.backAroundOldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));
	}

	@Test
	public void testCaseTakeLastCharAndAddItToFrontWhenStrHasOnlyOneChar() {
		String str = "a";
		String expected = "aaa";
		String actual1 = fixture.backAround(str);
		String actual2 = fixture.backAroundOldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));
	}

	@Test
	public void testCaseWhenStrIsNull() {
		String str = null;
		String expected = "";
		String actual1 = fixture.backAround(str);
		String actual2 = fixture.backAroundOldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));
	}

	@Test
	public void testCaseWhenStrIsEmpty() {
		String str = "";
		String expected = "";
		String actual1 = fixture.backAround(str);
		String actual2 = fixture.backAroundOldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));
	}

}

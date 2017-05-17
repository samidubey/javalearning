package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem15_StartHiTest {
	private Problem15_StartHi fixture;

	@Before
	public void setUp() {
		fixture = new Problem15_StartHi();
	}

	@Test
	public void testCaseStrStartsWithHi() {
		String str = "hi";
		Boolean expected = true;
		Boolean actual = fixture.startHi(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseStrNotStartsWithHi() {
		String str = "We hi";
		Boolean expected = false;
		Boolean actual = fixture.startHi(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseStrHasOnlyOneChar() {
		String str = "h";
		Boolean expected = false;
		Boolean actual = fixture.startHi(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseStrisNull() {
		String str = null;
		Boolean expected = false;
		Boolean actual = fixture.startHi(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseStrIsEmpty() {
		String str = "";
		Boolean expected = false;
		Boolean actual = fixture.startHi(str);
		assertThat(actual, is(equalTo(expected)));
	}
}

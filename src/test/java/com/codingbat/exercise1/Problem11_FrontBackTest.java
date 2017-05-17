package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem11_FrontBackTest {
	private Problem11_FrontBack fixture;

	@Before
	public void setUp() {
		fixture = new Problem11_FrontBack();
	}

	@Test
	public void testCaseSwitchedFrontAndLastChar() {
		String str = "Deepak";
		String expected = "keepaD";
		String actual1 = fixture.frontBack(str);
		String actual2 = fixture.frontBackOldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));

	}

	@Test
	public void testCaseWhenStrIsNull() {
		String str = null;
		String expected = "";
		String actual1 = fixture.frontBack(str);
		String actual2 = fixture.frontBackOldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));

	}

	@Test
	public void testCaseWhenStrIsEmpty() {
		String str = "";
		String expected = "";
		String actual1 = fixture.frontBack(str);
		String actual2 = fixture.frontBackOldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));

	}
}

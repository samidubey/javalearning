package com.codingbat.exercise2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem1_StringTimesTest {
	private Problem1_StringTimes fixture;

	@Before
	public void setUp() {
		fixture = new Problem1_StringTimes();
	}

	@Test
	public void testCaseRepitatedBasedOnNum() {
		String str = "Hi";
		int n = 2;
		String expected = "HiHi";
		String actual = fixture.stringTimes(str, n);
		assertThat(actual, is(equalTo(expected)));
	}
}

package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem9_MissingCharTest {

	private Problem9_MissingChar fixture;

	@Before
	public void setUp() {
		fixture = new Problem9_MissingChar();
	}

	@Test
	public void testCaseOutsideLowerBorder() {
		String str = "Kitten";
		int n = -1;
		String expected = "Kitten";
		String actual1 = fixture.missingChar(str, n);
		String actual2 = fixture.missingCharOldSchool(str, n);
		String actual3 = fixture.missingCharPatiOldSchool(str, n);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));
		assertThat(actual3, is(equalTo(expected)));

	}

	@Test
	public void testCaseLowerBorder() {
		String str = "Kitten";
		int n = 0;
		String expected = "itten";
		String actual1 = fixture.missingChar(str, n);
		String actual2 = fixture.missingCharOldSchool(str, n);
		String actual3 = fixture.missingCharPatiOldSchool(str, n);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));
		assertThat(actual3, is(equalTo(expected)));

	}

	@Test
	public void testCaseMiddleRange() {
		String str = "Kitten";
		int n = 1;
		String expected = "Ktten";
		String actual1 = fixture.missingChar(str, n);
		String actual2 = fixture.missingCharOldSchool(str, n);
		String actual3 = fixture.missingCharPatiOldSchool(str, n);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));
		assertThat(actual3, is(equalTo(expected)));

	}

	@Test
	public void testCaseHigherBorder() {
		String str = "Kitten";
		int n = 5;
		String expected = "Kitte";
		String actual1 = fixture.missingChar(str, n);
		String actual2 = fixture.missingCharOldSchool(str, n);
		String actual3 = fixture.missingCharPatiOldSchool(str, n);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));
		assertThat(actual3, is(equalTo(expected)));

	}

	@Test
	public void testCaseOutsideHigherBorder() {
		String str = "Kitten";
		int n = 6;
		String expected = "Kitten";
		String actual1 = fixture.missingChar(str, n);
		String actual2 = fixture.missingCharOldSchool(str, n);
		String actual3 = fixture.missingCharPatiOldSchool(str, n);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));
		assertThat(actual3, is(equalTo(expected)));

	}

	@Test
	public void testCaseWhenStrIsNull() {
		String str = null;
		int n = 6;
		String expected = "";
		String actual1 = fixture.missingChar(str, n);
		String actual2 = fixture.missingCharOldSchool(str, n);
		String actual3 = fixture.missingCharPatiOldSchool(str, n);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));
		assertThat(actual3, is(equalTo(expected)));

	}

	@Test
	public void testCaseWhenStrIsEmpty() {
		String str = "";
		int n = 6;
		String expected = "";
		String actual1 = fixture.missingChar(str, n);
		String actual2 = fixture.missingCharOldSchool(str, n);
		String actual3 = fixture.missingCharPatiOldSchool(str, n);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));
		assertThat(actual3, is(equalTo(expected)));

	}
}

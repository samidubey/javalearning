package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem25_In3050Test {
	private Problem25_In3050 fixture;

	@Before
	public void setUp() {
		fixture = new Problem25_In3050();
	}

	@Test
	public void testCaseBothNumAreBtw3040() {
		int a = 31;
		int b = 32;
		boolean expected = true;
		boolean actual = fixture.in3050(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumAreBtw30() {
		int a = 30;
		int b = 30;
		boolean expected = true;
		boolean actual = fixture.in3050(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumAreBt40() {
		int a = 40;
		int b = 40;
		boolean expected = true;
		boolean actual = fixture.in3050(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseFirstNumIsBtw3040() {
		int a = 31;
		int b = 44;
		boolean expected = false;
		boolean actual = fixture.in3050(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseSecondNumIsBtw3040() {
		int a = 44;
		int b = 32;
		boolean expected = false;
		boolean actual = fixture.in3050(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseFirstNumIsBtw4050() {
		int a = 44;
		int b = 67;
		boolean expected = false;
		boolean actual = fixture.in3050(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseSecondNumIsBtw4050() {
		int a = 78;
		int b = 44;
		boolean expected = false;
		boolean actual = fixture.in3050(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumAreBtw4050() {
		int a = 45;
		int b = 46;
		boolean expected = true;
		boolean actual = fixture.in3050(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumAre50() {
		int a = 50;
		int b = 50;
		boolean expected = true;
		boolean actual = fixture.in3050(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumAreNot304050() {
		int a = 8;
		int b = 9;
		boolean expected = false;
		boolean actual = fixture.in3050(a, b);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumAreNot30or50() {
		int a = 30;
		int b = 50;
		boolean expected = false;
		boolean actual = fixture.in3050(a, b);
		assertThat(actual, is(equalTo(expected)));
	}
}

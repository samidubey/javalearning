package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem23_IntMaxTest {
	private Problem23_IntMax fixture;

	@Before
	public void setUp() {
		fixture = new Problem23_IntMax();
	}

	@Test
	public void testCaseaIsGreaterthanbc() {
		int a = 3;
		int b = 2;
		int c = 1;
		int expected = 3;
		int actual = fixture.intMax(a, b, c);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCasebIsGreaterthanac() {
		int a = 3;
		int b = 6;
		int c = 1;
		int expected = 6;
		int actual = fixture.intMax(a, b, c);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCasecIsGreaterthanab() {
		int a = 3;
		int b = 2;
		int c = 8;
		int expected = 8;
		int actual = fixture.intMax(a, b, c);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseabcAreEqual() {
		int a = 3;
		int b = 3;
		int c = 3;
		int expected = 3;
		int actual = fixture.intMax(a, b, c);
		assertThat(actual, is(equalTo(expected)));
	}
}

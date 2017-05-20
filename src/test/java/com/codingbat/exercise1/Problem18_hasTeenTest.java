package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem18_hasTeenTest {
	private Problem18_hasTeen fixture;

	@Before
	public void setUp() {
		fixture = new Problem18_hasTeen();
	}

	@Test
	public void testCaseFirstNumberIsBtw1319() {
		int a = 13;
		int b = 10;
		int c = 20;
		boolean expected = true;
		boolean actual = fixture.hasTeen(a, b, c);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseSecondNumberIsBtw1319() {
		int a = 10;
		int b = 13;
		int c = 20;
		boolean expected = true;
		boolean actual = fixture.hasTeen(a, b, c);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseThirdNumberIsBtw1319() {
		int a = 10;
		int b = 10;
		int c = 13;
		boolean expected = true;
		boolean actual = fixture.hasTeen(a, b, c);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseAllNumberIsBtw1319() {
		int a = 15;
		int b = 15;
		int c = 15;
		boolean expected = true;
		boolean actual = fixture.hasTeen(a, b, c);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseAllAre13() {
		int a = 13;
		int b = 13;
		int c = 13;
		boolean expected = true;
		boolean actual = fixture.hasTeen(a, b, c);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseAllAre19() {
		int a = 19;
		int b = 19;
		int c = 19;
		boolean expected = true;
		boolean actual = fixture.hasTeen(a, b, c);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseAllAreNotNumberIsBtw1319() {
		int a = 25;
		int b = 25;
		int c = 25;
		boolean expected = false;
		boolean actual = fixture.hasTeen(a, b, c);
		assertThat(actual, is(equalTo(expected)));
	}

}

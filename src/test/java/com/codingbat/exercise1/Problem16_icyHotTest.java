package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem16_icyHotTest {
	private Problem16_icyHot fixture;

	@Before
	public void setUp() {
		fixture = new Problem16_icyHot();
	}

	@Test
	public void testCaseOneOfThemTempLessThanZero() {
		int temp1 = 120;
		int temp2 = -1;
		boolean expected = true;
		boolean actual = fixture.icHot(temp1, temp2);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseOneOfThemTempMoreThan100() {
		int temp1 = 120;
		int temp2 = -1;
		boolean expected = true;
		boolean actual = fixture.icHot(temp1, temp2);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothOfThemTempMoreThan100() {
		int temp1 = 120;
		int temp2 = 120;
		boolean expected = false;
		boolean actual = fixture.icHot(temp1, temp2);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothOfThemTempLessThanZero() {
		int temp1 = -1;
		int temp2 = -1;
		boolean expected = false;
		boolean actual = fixture.icHot(temp1, temp2);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothOfThemZero() {
		int temp1 = 0;
		int temp2 = 0;
		boolean expected = false;
		boolean actual = fixture.icHot(temp1, temp2);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothOfThem100() {
		int temp1 = 100;
		int temp2 = 100;
		boolean expected = false;
		boolean actual = fixture.icHot(temp1, temp2);
		assertThat(actual, is(equalTo(expected)));
	}

}

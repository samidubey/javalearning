package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem22_startOzTest {
	private Problem22_startOz fixture;

	@Before
	public void setUp() {
		fixture = new Problem22_startOz();
	}

	@Test
	public void testCase01IndexStartWithoz() {
		String str = "ozymandias";
		String expected = "oz";
		String actual = fixture.startOz(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCase0IndexStartWitho() {
		String str = "oxx";
		String expected = "o";
		String actual = fixture.startOz(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCase1IndexStartWithz() {
		String str = "bzoo";
		String expected = "z";
		String actual = fixture.startOz(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCase1StrHasOnlyTwoChar01IndexStartWithoz() {
		String str = "oz";
		String expected = "oz";
		String actual = fixture.startOz(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCase1StrHasOnlyTwoChar0IndexStartWitho() {
		String str = "om";
		String expected = "o";
		String actual = fixture.startOz(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCase1StrHasOnlyTwoChar1IndexStartWithz() {
		String str = "mz";
		String expected = "z";
		String actual = fixture.startOz(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCase1StrHasOnlyOneChar() {
		String str = "o";
		String expected = "o";
		String actual = fixture.startOz(str);
		assertThat(actual, is(equalTo(expected)));
	}

	@Test
	public void testCase1StrHasOnlyTwoChar01IndexStartWithzo() {
		String str = "zo";
		String expected = "";
		String actual = fixture.startOz(str);
		assertThat(actual, is(equalTo(expected)));
	}
}

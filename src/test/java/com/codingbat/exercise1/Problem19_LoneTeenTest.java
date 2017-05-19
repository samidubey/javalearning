package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem19_LoneTeenTest {
	private Problem19_LoneTeen fixture;

	@Before
	public void setUp() {
		fixture = new Problem19_LoneTeen();
	}

	@Test
	public void testCaseFirstNumberIsBtw1319() {
		int a = 13;
		int b = 99;
		boolean expected = true;
		boolean actual1 = fixture.loneTeen(a, b);
		assertThat(actual1, is(equalTo(expected)));
		boolean actual2 = fixture.loneTeenOldSchool(a, b);
		assertThat(actual2, is(equalTo(expected)));
	}

	@Test
	public void testCaseSecondNumberIsBtw1319() {
		int a = 21;
		int b = 19;
		boolean expected = true;
		boolean actual1 = fixture.loneTeen(a, b);
		assertThat(actual1, is(equalTo(expected)));
		boolean actual2 = fixture.loneTeenOldSchool(a, b);
		assertThat(actual2, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumberAreBtw1319() {
		int a = 14;
		int b = 15;
		boolean expected = false;
		boolean actual1 = fixture.loneTeen(a, b);
		assertThat(actual1, is(equalTo(expected)));
		boolean actual2 = fixture.loneTeenOldSchool(a, b);
		assertThat(actual2, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumberAre13() {
		int a = 13;
		int b = 13;
		boolean expected = false;
		boolean actual1 = fixture.loneTeen(a, b);
		assertThat(actual1, is(equalTo(expected)));
		boolean actual2 = fixture.loneTeenOldSchool(a, b);
		assertThat(actual2, is(equalTo(expected)));
	}

	@Test
	public void testCaseBothNumberAre19() {
		int a = 19;
		int b = 19;
		boolean expected = false;
		boolean actual1 = fixture.loneTeen(a, b);
		assertThat(actual1, is(equalTo(expected)));
		boolean actual2 = fixture.loneTeenOldSchool(a, b);
		assertThat(actual2, is(equalTo(expected)));
	}
}

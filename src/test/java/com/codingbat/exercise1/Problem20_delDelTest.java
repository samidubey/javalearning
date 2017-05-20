package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem20_delDelTest {
	private Problem20_delDel fixture;

	@Before
	public void setUp() {
		fixture = new Problem20_delDel();
	}

	@Test
	public void testCaseindex1StartsWithdel() {
		String str = "adelbc";
		String expected = "abc";
		String actual1 = fixture.delDelOldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		String actual2 = fixture.delDel(str);
		assertThat(actual2, is(equalTo(expected)));

	}

	@Test
	public void testCaseIndex1NotStartsWithdel() {
		String str = "adedbc";
		String expected = "adedbc";
		String actual1 = fixture.delDelOldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		String actual2 = fixture.delDel(str);
		assertThat(actual2, is(equalTo(expected)));

	}

	@Test
	public void testCaseStrIsNull() {
		String str = null;
		String expected = "";
		String actual1 = fixture.delDelOldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		String actual2 = fixture.delDel(str);
		assertThat(actual2, is(equalTo(expected)));

	}

	@Test
	public void testCaseStrIsEmpty() {
		String str = "";
		String expected = "";
		String actual1 = fixture.delDelOldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		String actual2 = fixture.delDel(str);
		assertThat(actual2, is(equalTo(expected)));

	}

	@Test
	public void testCaseStrHasOnlyThreeChar() {
		String str = "del";
		String expected = "del";
		String actual1 = fixture.delDelOldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		String actual2 = fixture.delDel(str);
		assertThat(actual2, is(equalTo(expected)));

	}

	@Test
	public void testCaseStrHasOnlyTwoChar() {
		String str = "de";
		String expected = "de";
		String actual1 = fixture.delDelOldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		String actual2 = fixture.delDel(str);
		assertThat(actual2, is(equalTo(expected)));

	}

	@Test
	public void testCaseStrHasOnlyOneChar() {
		String str = "d";
		String expected = "d";
		String actual1 = fixture.delDelOldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		String actual2 = fixture.delDel(str);
		assertThat(actual2, is(equalTo(expected)));

	}

}

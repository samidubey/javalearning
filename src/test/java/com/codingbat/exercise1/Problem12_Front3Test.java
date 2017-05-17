package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem12_Front3Test {
	private Problem12_Front3 fixture;

	@Before
	public void setUp() {
		fixture = new Problem12_Front3();
	}

	@Test
	public void testCaseThreeFrontCharacterTakenAndRepitatedThrice() {
		String str = "java";
		String expected = "javjavjav";
		String actual1 = fixture.front3(str);
		String actual2 = fixture.front3OldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));

	}

	@Test
	public void testCaseWhenStrHasOnlyThreeCharacters() {
		String str = "jaj";
		String expected = "jajjajjaj";
		String actual1 = fixture.front3(str);
		String actual2 = fixture.front3OldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));

	}

	@Test
	public void testCaseWhenStrHasOnlyTwoCharacters() {
		String str = "ja";
		String expected = "jajaja";
		String actual1 = fixture.front3(str);
		String actual2 = fixture.front3OldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));

	}

	@Test
	public void testCaseWhenStrHasOnlyOneCharacters() {
		String str = "a";
		String expected = "aaa";
		String actual1 = fixture.front3(str);
		String actual2 = fixture.front3OldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));

	}

	@Test
	public void testCaseWhenStrIsNull() {
		String str = null;
		String expected = "";
		String actual1 = fixture.front3(str);
		String actual2 = fixture.front3OldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));

	}

	@Test
	public void testCaseWhenStrIsEmpty() {
		String str = "";
		String expected = "";
		String actual1 = fixture.front3(str);
		String actual2 = fixture.front3OldSchool(str);
		assertThat(actual1, is(equalTo(expected)));
		assertThat(actual2, is(equalTo(expected)));

	}
}

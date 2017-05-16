package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class Problem2_Diff21Test {
    private Problem2_Diff21 fixture;

    @Before
    public void setUp() {
        fixture = new Problem2_Diff21();
    }

    @Test
    public void testDiff21LessThan21() {
        int expected = 2;
        int actual = fixture.diff21(19);
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void testDiff21MoreThan21() {
        int expected = 2;
        int actual = fixture.diff21(22);
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void testDiff21EqualsTo21() {
        int expected = 0;
        int actual = fixture.diff21(21);
        assertThat(expected, is(equalTo(actual)));
    }
}

package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem7_NearHundredTest {

    private Problem7_NearHundred fixture;

    @Before
    public void setUp() {
        fixture = new Problem7_NearHundred();
    }

    @Test
    public void testNearHundredWhenLessThan10() {
        boolean expected = true;
        boolean actual = fixture.nearHundred(98);
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void testNearHundredWhenEqualTo10() {
        boolean expected = true;
        boolean actual = fixture.nearHundred(90);
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void testNearHundredWhenGreaterThan10() {
        boolean expected = false;
        boolean actual = fixture.nearHundred(89);
        assertThat(expected, is(equalTo(actual)));
    }
}

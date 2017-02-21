package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem7_PosNegTest {
    private Problem7_PosNeg fixture;

    @Before
    public void setup() {
        fixture = new Problem7_PosNeg();
    }

    @Test
    public void testPosNegWhenFirstNumberNegativeAndNegValueFalse() {
        boolean expected = true;
        boolean actual = fixture.posNeg(-1, 1, false);
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void testPosNegWhenSecondNumberNegativeAndNegValueFalse() {
        boolean expected = true;
        boolean actual = fixture.posNeg(1, -1, false);
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void testPosNegWhenBothNumberNegativeAndNegValueFalse() {
        boolean expected = false;
        boolean actual = fixture.posNeg(-1, -1, false);
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void testPosNegWhenBothNumberPositiveAndNegValueFalse() {
        boolean expected = false;
        boolean actual = fixture.posNeg(1, 1, false);
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void testPosNegWhenBothNumberNegativeAndNegValueTrue() {
        boolean expected = true;
        boolean actual = fixture.posNeg(-1, -1, true);
        assertThat(expected, is(equalTo(actual)));
    }
}

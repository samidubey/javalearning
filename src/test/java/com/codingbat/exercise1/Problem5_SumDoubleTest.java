package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem5_SumDoubleTest {
    private Problem5_SumDouble fixture;

    @Before
    public void setup() {
        fixture = new Problem5_SumDouble();
    }

    @Test
    public void testSumDoubleWhenNumberAreEqual() {
        int num1 = 2;
        int num2 = 2;
        int expected = 8;
        int actual = fixture.sumDouble(num1, num2);
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void testSumDoubleWhenNumberAreNotEqual() {
        int num1 = 1;
        int num2 = 2;
        int expected = 3;
        int actual = fixture.sumDouble(num1, num2);
        assertThat(expected, is(equalTo(actual)));
    }
}

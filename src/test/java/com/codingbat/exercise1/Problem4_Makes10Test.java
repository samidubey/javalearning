package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class Problem4_Makes10Test {

    private Problem4_Makes10 feature;

    @Before
    public void setup() {
        feature = new Problem4_Makes10();
    }

    @Test
    public void Makes10WhenSumIs10() {
        int number1 = 1;
        int number2 = 9;
        boolean actual = feature.makes10(number1, number2);
        boolean expected = true;
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void Makes10WhenAnyNumberIs10() {
        int number1 = 9;
        int number2 = 10;
        boolean actual = feature.makes10(number1, number2);
        boolean expected = true;
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void Makes10WhenAnyNumberIsNot10AndSumIsNot10() {
        int number1 = 9;
        int number2 = 9;
        boolean actual = feature.makes10(number1, number2);
        boolean expected = false;
        assertThat(expected, is(equalTo(actual)));
    }
}

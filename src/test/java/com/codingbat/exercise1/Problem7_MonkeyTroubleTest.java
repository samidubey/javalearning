package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Problem7_MonkeyTroubleTest {

    private Problem7_MonkeyTrouble fixture;

    @Before
    public void setup() {
        fixture = new Problem7_MonkeyTrouble();
    }

    @Test
    public void testWhenBothAreSmiling() {
        boolean expected = true;
        boolean actual = fixture.monkeyTrouble(true, true);
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void testWhenBothAreNotSmiling() {
        boolean expected = true;
        boolean actual = fixture.monkeyTrouble(false, false);
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void testWhenFirstMonkeyIsSmiling() {
        boolean expected = false;
        boolean actual = fixture.monkeyTrouble(true, false);
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void testWhenSecondMonkeyIsSmiling() {
        boolean expected = false;
        boolean actual = fixture.monkeyTrouble(false, true);
        assertThat(expected, is(equalTo(actual)));
    }
}

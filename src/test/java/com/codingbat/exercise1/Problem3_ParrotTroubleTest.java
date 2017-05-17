package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class Problem3_ParrotTroubleTest {

    private Problem3_ParrotTrouble fixture;

    @Before
    public void setUp() {
        fixture = new Problem3_ParrotTrouble();
    }

    @Test
    public void Problem3_ParrotTroubleWhenParrotTalkingAndHourLessThan7OrMoreThan20() {
        boolean expected = true;
        int hour = 6;
        boolean actual = fixture.parrotTrouble(true, hour);
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void Problem3_ParrotTroubleWhenParrotNotTalkingAndHourMoreThan7OrLessThan20() {
        boolean expected = false;
        int hour = 8;
        boolean actual = fixture.parrotTrouble(false, hour);
        assertThat(expected, is(equalTo(actual)));
    }
}

package com.codingbat.exercise1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class Problem1_SleepinTest {

    private Problem1_Sleepin fixture;

    @Before
    public void setUp() {
        System.out.println("Setting Up Things...");
        fixture = new Problem1_Sleepin();
    }

    @Test
    public void testSleepinWhenWeekDayOrIsVacation() {
        System.out.println("Testing Method - testSleepinWhenWeekDayOrIsVacation()");
        boolean expected = true;
        boolean actual = fixture.sleepIn(true, true);

        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void testSleepinWhenWeekDayOrIsNotVacation() {
        System.out.println("Testing Method - testSleepinWhenWeekDayOrIsNotVacation()");
        boolean expected = false;
        boolean actual = fixture.sleepIn(true, false);
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void testSleepinWhenNotWeekDayOrIsVacation() {
        System.out.println("Testing Method - testSleepinWhenNotWeekDayOrIsVacation()");
        boolean expected = true;
        boolean actual = fixture.sleepIn(false, true);
        assertThat(expected, is(equalTo(actual)));
    }

    @Test
    public void testSleepinWhenNotWeekDayOrIsNotVacation() {
        System.out.println("Testing Method - testSleepinWhenNotWeekDayOrIsNotVacation()");
        boolean expected = true;
        boolean actual = fixture.sleepIn(false, false);
        assertThat(expected, is(equalTo(actual)));
    }
}

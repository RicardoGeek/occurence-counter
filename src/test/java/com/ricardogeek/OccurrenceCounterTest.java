package com.ricardogeek;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OccurrenceCounterTest {
    private final OccurrenceCounter occurrenceCounter = new OccurrenceCounter();

    @Test
    public void testCase1() {
        final String result1 = occurrenceCounter.countOcurrences("22000001");

        assertEquals(result1, "2 FOR 2 0 FOR 5 1");
    }

    @Test
    public void testCase2() {
        final String result1 = occurrenceCounter.countOcurrences("111110");

        assertEquals(result1, "1 FOR 5 0");
    }

    @Test
    public void testCase3() {
        final String result1 = occurrenceCounter.countOcurrences("123465555555555");

        assertEquals(result1, "1 2 3 4 6 5 FOR 10");
    }
}

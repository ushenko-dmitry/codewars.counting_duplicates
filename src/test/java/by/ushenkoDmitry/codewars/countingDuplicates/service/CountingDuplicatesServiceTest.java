package by.ushenkoDmitry.codewars.countingDuplicates.service;

import org.junit.Test;

import static by.ushenkoDmitry.codewars.countingDuplicates.service.CountingDuplicatesService.duplicateCount;
import static org.junit.Assert.assertEquals;

public class CountingDuplicatesServiceTest {

    @Test
    public void simpleTest1() {
        assertEquals(0, duplicateCount("abcde"));
    }

    @Test
    public void simpleTest2() {
        assertEquals(2, duplicateCount("aabbcde"));
    }

    @Test
    public void simpleTest3() {
        assertEquals(2, duplicateCount("aabBcde"));
    }

    @Test
    public void simpleTest4() {
        assertEquals(1, duplicateCount("indivisibility"));
    }

    @Test
    public void simpleTest5() {
        assertEquals(2, duplicateCount("Indivisibilities"));
    }

    @Test
    public void simpleTest6() {
        assertEquals(2, duplicateCount("aA11"));
    }

    @Test
    public void simpleTest7() {
        assertEquals(2, duplicateCount("ABBA"));
    }

}
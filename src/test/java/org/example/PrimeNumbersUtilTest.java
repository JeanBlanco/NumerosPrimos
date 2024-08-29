package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.Collections;
import java.util.List;

public class PrimeNumbersUtilTest {
    @Test
    public void  testingPrime(){
        List<Integer> actual =
                PrimeNumbersUtil.getPrimeNumbersInRange(10,30);
        assertEquals(List.of(11,13,17,19,23,29), actual);



    }
    @Test
    public void  testingPrime2() {
        List<Integer> actuale =
                PrimeNumbersUtil.getPrimeNumbersInRange(90, 96);
        assertEquals(Collections.emptyList(), actuale);
        assertTrue(actuale.isEmpty());

    }

    @Test
    public void  testingPrime3() {
        List<Integer> actual3 =
                PrimeNumbersUtil.getPrimeNumbersInRange(11, 29);
        assertEquals(List.of(11,13,17,19,23,29), actual3);
        assertFalse(actual3.isEmpty());

    }

    @Test
    public void testIsPrimeInRangeBadArguments() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> PrimeNumbersUtil.getPrimeNumbersInRange(60, 10)
        );

        assertEquals("Upper limit must be greater than lower limit",
                ex.getMessage());

    }

    @Test
    public void testIsPrimeInRangeOne() {
        List<Integer> actual4 =
                PrimeNumbersUtil.getPrimeNumbersInRange(1, 29);
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29), actual4);
        assertFalse(actual4.isEmpty());

    }



}

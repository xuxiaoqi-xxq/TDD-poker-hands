package com.example;

import com.example.comparator.FourComparator;
import com.example.entity.PorkerHand;
import com.example.util.PorkerHandUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FourComparatorTest {
    @Test
    void should_return_1_when_call_compare_given_7H3C7D7S7S_and_4S4S4C4D5H() {
        //given
        String stringPorkerHand1 = "7H 3C 7D 7S 7S";
        String stringPorkerHand2 = "4S 4S 4C 4D 5H";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        FourComparator fourComparator = new FourComparator();
        //when
        int result = fourComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(1, result);
    }

    @Test
    void should_return_negative_1_when_call_compare_given_3H3C3D3S5S_and_4S4S4C4D5H() {
        //given
        String stringPorkerHand1 = "3H 3C 3D 3S 5S";
        String stringPorkerHand2 = "4S 4S 4C 4D 5H";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        FourComparator fourComparator = new FourComparator();
        //when
        int result = fourComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(-1, result);
    }

    @Test
    void should_return_0_when_call_compare_given_6S7S2C4D5H_and_TS4S4CJD5H() {
        //given
        String stringPorkerHand1 = "6S 7S 2C 4D 5H";
        String stringPorkerHand2 = "TS 4S 4C JD 5H";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        FourComparator fourComparator = new FourComparator();
        //when
        int result = fourComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(0, result);
    }
}

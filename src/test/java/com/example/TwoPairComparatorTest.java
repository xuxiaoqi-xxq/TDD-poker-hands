package com.example;


import com.example.comparator.TwoPairComparator;
import com.example.entity.PorkerHand;
import com.example.util.PorkerHandUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoPairComparatorTest {
    @Test
    void should_return_negative_1_when_call_compare_given_3H3D5S9C5D_and_4S4D6C6D3H() {
        //given
        String stringPorkerHand1 = "3H 3D 5S 9C 5D";
        String stringPorkerHand2 = "4S 4D 6C 6D 3H";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        TwoPairComparator twoPairComparator = new TwoPairComparator();
        //when
        int result = twoPairComparator.compare(porkerHand1,porkerHand2);
        //
        assertEquals(-1,result);
    }

    @Test
    void should_return_negative_1_when_call_compare_given_3H3D5S9C5D_and_4S4D5C5D3H() {
        //given
        String stringPorkerHand1 = "3H 3D 5S 9C 5D";
        String stringPorkerHand2 = "4S 4D 5C 6D 5H";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        TwoPairComparator twoPairComparator = new TwoPairComparator();
        //when
        int result = twoPairComparator.compare(porkerHand1,porkerHand2);
        //
        assertEquals(-1,result);
    }

    @Test
    void should_return_1_when_call_compare_given_3H3C5S9C5D_and_3S3D5C6D5H() {
        //given
        String stringPorkerHand1 = "3H 3C 5S 9C 5D";
        String stringPorkerHand2 = "3S 3D 5C 6D 5H";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        TwoPairComparator twoPairComparator = new TwoPairComparator();
        //when
        int result = twoPairComparator.compare(porkerHand1,porkerHand2);
        //
        assertEquals(1,result);
    }
}

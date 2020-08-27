package com.example;

import com.example.comparator.StraightFlushComparator;
import com.example.entity.PorkerHand;
import com.example.util.PorkerHandUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StraightFlushComparatorTest {

    @Test
    void should_return_1_when_call_compare_given_3H4H5H6H7H_and_2D3D4D5D6D() {
        //given
        String stringPorkerHand1 = "3H 4H 5H 6H 7H";
        String stringPorkerHand2 = "2D 3D 4D 5D 6D";
        //when
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        StraightFlushComparator straightFlushComparator = new StraightFlushComparator();
        int result = straightFlushComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(1, result);
    }

    @Test
    void should_return_negative_1_when_call_compare_given_3H4H5H6H7H_and_THJHQHKHAH() {
        //given
        String stringPorkerHand1 = "3H 4H 5H 6H 7H";
        String stringPorkerHand2 = "TH JH QH KH AH";
        //when
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        StraightFlushComparator straightFlushComparator = new StraightFlushComparator();
        int result = straightFlushComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(-1, result);
    }

    @Test
    void should_return_0_when_call_compare_given_3H4H5H6H7H_and_3D4D5D6D7D() {
        //given
        String stringPorkerHand1 = "3H 4H 5H 6H 7H";
        String stringPorkerHand2 = "3D 4D 5D 6D 7D";
        //when
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        StraightFlushComparator straightFlushComparator = new StraightFlushComparator();
        int result = straightFlushComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(0, result);
    }
}

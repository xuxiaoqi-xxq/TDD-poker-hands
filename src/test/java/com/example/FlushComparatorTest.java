package com.example;

import com.example.comparator.FlushComparator;
import com.example.entity.PorkerHand;
import com.example.util.PorkerHandUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlushComparatorTest {

    @Test
    void should_return_1_when_call_compare_given_2H4H3H9HKH_and_4H6C7DKSQS() {
        //given
        String stringPorkerHand1 = "2H 4H 3H 9H KH";
        String stringPorkerHand2 = "4H 6C 7D KS QS";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        FlushComparator flushComparator = new FlushComparator();
        //when
        int result = flushComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(1, result);
    }

    @Test
    void should_return_negative_1_when_call_compare_given_4H6C7DKSQS_and_2H4H3H9HKH() {
        //given
        String stringPorkerHand1 = "4H 6C 7D KS QS";
        String stringPorkerHand2 = "2H 4H 3H 9H KH";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        FlushComparator flushComparator = new FlushComparator();
        //when
        int result = flushComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(-1, result);
    }

    @Test
    void should_return_0_when_call_compare_given_2H4H3H9HKH_and_2H4H3H9HKH() {
        //given
        String stringPorkerHand1 = "2H 4H 3H 9H KH";
        String stringPorkerHand2 = "2H 4H 3H 9H KH";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        FlushComparator flushComparator = new FlushComparator();
        //when
        int result = flushComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(0, result);
    }
}

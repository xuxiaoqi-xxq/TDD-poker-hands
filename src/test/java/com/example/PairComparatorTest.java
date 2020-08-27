package com.example;

import com.example.comparator.FullHouseComparator;
import com.example.comparator.PairComparator;
import com.example.entity.PorkerHand;
import com.example.util.PorkerHandUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairComparatorTest {
    @Test
    void should_return_1_when_call_compare_given_3H3D5S9CKD_and_2H2D6STCAD(){
        //given
        String stringPorkerHand1 = "3H 3D 5S 9C KD";
        String stringPorkerHand2 = "2H 2D 6S TC AD";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        PairComparator pairComparator = new PairComparator();
        //when
        int result = pairComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(1, result);
    }

    @Test
    void should_return_negative_1_when_call_compare_given_3H3D5S9CKD_and_2H2D6STCAD(){
        //given
        String stringPorkerHand1 = "3H 3D 5S 9C KD";
        String stringPorkerHand2 = "3S 3C 6S TC AD";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        PairComparator pairComparator = new PairComparator();
        //when
        int result = pairComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(-1, result);
    }
}

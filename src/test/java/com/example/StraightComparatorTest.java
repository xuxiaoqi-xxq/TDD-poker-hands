package com.example;

import com.example.comparator.StraightComparator;
import com.example.entity.PorkerHand;
import com.example.util.PorkerHandUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StraightComparatorTest {

    @Test
    void should_return_1_when_call_compare_given_TDJDQSKSAH_and_7H8S9DTSJS() {
        String stringPorkerHand1 = "TD JD QS KS AH";
        String stringPorkerHand2 = "7H 8S 9D TS JS";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        StraightComparator straightComparator = new StraightComparator();

        //when
        int result = straightComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(1, result);
    }

    @Test
    void should_return_negative_1_when_call_compare_given_7H8S9DTSJS_and_TDJDQSKSAH() {
        String stringPorkerHand1 = "TD JD QS KS AH";
        String stringPorkerHand2 = "7H 8S 9D TS JS";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        StraightComparator straightComparator = new StraightComparator();

        //when
        int result = straightComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(1, result);
    }

    @Test
    void should_return_0_when_call_compare_given_TDJDQSKSAH_and_TCJDQSKDAH() {
        String stringPorkerHand1 = "TD JD QS KS AH";
        String stringPorkerHand2 = "TC JD QS KD AH";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        StraightComparator straightComparator = new StraightComparator();

        //when
        int result = straightComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(0, result);
    }
}

package com.example;

import com.example.comparator.HighCardComparator;
import com.example.entity.PorkerHand;
import com.example.util.PorkerHandUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighCardComparatorTest {

    @Test
    void should_return_1_when_call_compare_given_2S9S6CKDAH_and_7H3C5D9SKS() {
        //given
        String stringPorkerHand1 = "2S 9S 6C KD AH";
        String stringPorkerHand2 = "7H 3C 5D 9S KS";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        HighCardComparator HighCardComparator = new HighCardComparator();
        //when
        int result = HighCardComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(1, result);
    }

    @Test
    void should_return_negative_1_when_call_compare_given_4H3C5D9SKS_and_2S9S6CKD7H() {
        //given
        String stringPorkerHand1 = "4H 3C 5D 9S KS";
        String stringPorkerHand2 = "2S 9S 6C KD 7H";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        HighCardComparator HighCardComparator = new HighCardComparator();
        //when
        int result = HighCardComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(-1, result);
    }

    @Test
    void should_return_0_when_call_compare_given_4S9S6CKDAH_and_4C9D6CKDAH() {
        //given
        String stringPorkerHand1 = "4S 9S 6C KD AH";
        String stringPorkerHand2 = "4C 9D 6C KD AH";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        HighCardComparator HighCardComparator = new HighCardComparator();
        //when
        int result = HighCardComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(0, result);
    }

}

package com.example;

import com.example.comparator.FourComparator;
import com.example.comparator.FullHouseComparator;
import com.example.entity.PorkerHand;
import com.example.util.PorkerHandUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FullHouseComparatorTest {

    @Test
    void should_return_1_when_call_compare_given_4S5S4C4D5H_and_3H3C5D3S5S() {
        //given
        String stringPorkerHand1 = "4S 5S 4C 4D 5H";
        String stringPorkerHand2 = "3H 3C 5D 3S 5S";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        FullHouseComparator fullHouseComparator = new FullHouseComparator();
        //when
        int result = fullHouseComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(1, result);
    }
    @Test
    void should_return_negative_1_when_call_compare_given_3H3C5D3S5S_and_4S5S4C4D5H() {
        //given
        String stringPorkerHand1 = "3H 3C 5D 3S 5S";
        String stringPorkerHand2 = "4S 5S 4C 4D 5H";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        FullHouseComparator fullHouseComparator = new FullHouseComparator();
        //when
        int result = fullHouseComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(-1, result);
    }

    @Test
    void should_return_0_when_call_compare_given_4S5S4C4D5H_and_4S5S4C4D5H() {
        //given
        String stringPorkerHand1 = "4S 5S 4C 4D 5H";
        String stringPorkerHand2 = "4S 5S 4C 4D 5H";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        FullHouseComparator fullHouseComparator = new FullHouseComparator();
        //when
        int result = fullHouseComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(0, result);
    }
}

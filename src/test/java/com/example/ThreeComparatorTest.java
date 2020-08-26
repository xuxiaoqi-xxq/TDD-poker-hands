package com.example;

import com.example.comparator.ThreeComparator;
import com.example.entity.PorkerHand;
import com.example.util.PorkerHandUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeComparatorTest {
    @Test
    void should_return_1_when_call_compare_given_AHAS5D8CAD_and_5H7C9C7S7S() {
        //given
        String stringPorkerHand1 = "AH AS 5D 8C AD";
        String stringPorkerHand2 = "5H 7C 9C 7S 7S";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        ThreeComparator threeComparator = new ThreeComparator();
        //when
        int result = threeComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(1, result);
    }

    @Test
    void should_return_1_when_call_compare_given_AHAS5DTCAD_and_AHAS5D8CAD() {
        //given
        String stringPorkerHand1 = "AH AS 5D TC AD";
        String stringPorkerHand2 = "AH AS 5D 8C AD";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        ThreeComparator threeComparator = new ThreeComparator();
        //when
        int result = threeComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(1, result);
    }

    @Test
    void should_return_1_when_call_compare_given_AHAS5DTCAD_and_AHAS4DTCAD() {
        //given
        String stringPorkerHand1 = "AH AS 5D TC AD";
        String stringPorkerHand2 = "AH AS 4D TC AD";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        ThreeComparator threeComparator = new ThreeComparator();
        //when
        int result = threeComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(1, result);
    }

    @Test
    void should_return_1_when_call_compare_given_2H8S8D8C3D_and_3H7S7D9C7D() {
        //given
        String stringPorkerHand1 = "2H 8S 8D 8C 3D";
        String stringPorkerHand2 = "3H 7S 7D 9C 7D";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        ThreeComparator threeComparator = new ThreeComparator();
        //when
        int result = threeComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(1, result);
    }

    @Test
    void should_return_negative_1_when_call_compare_given_5H7C9C7S7S_and_AHAS5D8CAD() {
        //given
        String stringPorkerHand1 = "5H 7C 9C 7S 7S";
        String stringPorkerHand2 = "AH AS 5D 8C AD";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        ThreeComparator threeComparator = new ThreeComparator();
        //when
        int result = threeComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(-1, result);
    }

    @Test
    void should_return_0_when_call_compare_given_AHAS5D8CAD_and_ADAS5D8SAD() {
        //given
        String stringPorkerHand1 = "AH AS 5D 8C AD";
        String stringPorkerHand2 = "AD AS 5D 8S AD";
        PorkerHand porkerHand1 = PorkerHandUtil.parse(stringPorkerHand1);
        PorkerHand porkerHand2 = PorkerHandUtil.parse(stringPorkerHand2);
        ThreeComparator threeComparator = new ThreeComparator();
        //when
        int result = threeComparator.compare(porkerHand1, porkerHand2);
        //then
        assertEquals(0, result);
    }

}

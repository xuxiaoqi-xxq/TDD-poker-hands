package com.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {
    private static Demo demo;

    @BeforeAll
    public static void setUp() {
        demo = new Demo();
    }

    @Test
    public void test01() {
        String result = demo.run();
        assertThat(result).isEqualTo("ABC");
    }

    @Test
    void should_return_1_when_call_compare_given_2H4H3H9HKH_and_4H6C7DKSQS(){
        String stringPorkerHand1 = "2H 4H 3H 9H KH";
        String stringPorkerHand2 = "4H 6C 7D KS QS";
        int compare = demo.compare(stringPorkerHand1, stringPorkerHand2);
        assertEquals(1,compare);
    }


    @Test
    void should_return_1_when_call_compare_given_3H4H5H6H7H_and_4H6C7DKSQS(){
        String stringPorkerHand1 = "3H 4H 5H 6H 7H";
        String stringPorkerHand2 = "4H 6C 7D KS QS";
        int compare = demo.compare(stringPorkerHand1, stringPorkerHand2);
        assertEquals(1,compare);
    }
}
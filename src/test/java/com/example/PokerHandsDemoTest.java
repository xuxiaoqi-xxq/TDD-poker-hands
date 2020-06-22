package com.example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PokerHandsDemoTest {
    private static PokerHandsDemo pokerHandsDemo;

    @BeforeClass
    public static void setUp() {
        pokerHandsDemo = new PokerHandsDemo();
    }

    @Test
    public void should_return_ABC_when_analysePokerHands_given_2H_3D_5S_9C_KD() {
        // given
        String[] pokerHands = new String[] {
                "2H", "3D", "5S", "9C", "KD"
        };
        // when
        String result = pokerHandsDemo.analysePokerHands(pokerHands);

        // then
        assertThat(result).isEqualTo("ABC");
    }
}
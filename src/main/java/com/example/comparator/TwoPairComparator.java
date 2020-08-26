package com.example.comparator;

import com.example.entity.PorkerHand;

import java.util.Comparator;
import java.util.List;


public class TwoPairComparator implements Comparator<PorkerHand> {

    Integer isTwoPair(List<Integer> faces) {
        int[] nums = new int[14];
        for (Integer face : faces) {
            nums[face]++;
        }
        int result = -1;
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                num++;
                result = Math.max(i, result);
            }
        }
        return num == 2 ? result : -1;
    }

    Integer getSecondPair(List<Integer> faces){
        int[] nums = new int[14];
        for (Integer face : faces) {
            nums[face]++;
        }
        int result = 14;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                result = Math.min(i, result);
            }
        }
        return result;
    }

    @Override
    public int compare(PorkerHand porkerHand1, PorkerHand porkerHand2) {
        List<Integer> hand1Faces = porkerHand1.getFaces();
        List<Integer> hand2Faces = porkerHand2.getFaces();
        Integer hand1TwoPair = isTwoPair(hand1Faces);
        Integer hand2TwoPair = isTwoPair(hand2Faces);
        if (hand1TwoPair.equals(-1) && hand2TwoPair.equals(-1)) {
            //both are not two pairs, return 0;
            return 0;
        } else if (hand1TwoPair.equals(-1)) {
            return -1;
        } else if (hand2TwoPair.equals(-1)) {
            return 1;
        } else {
            if (hand1TwoPair > hand2TwoPair) {
                return 1;
            } else if (hand1TwoPair < hand2TwoPair) {
                return -1;
            }else {
                return compareSecondPair(hand1Faces,hand2Faces);
            }
        }
    }
    private int compareSecondPair(List<Integer> hand1Faces, List<Integer> hand2Faces) {
        Integer hand1SecondPair = getSecondPair(hand1Faces);
        Integer hand2SecondPair = getSecondPair(hand2Faces);
        if(hand1SecondPair>hand2SecondPair){
            return 1;
        }else if(hand1SecondPair<hand2SecondPair){
            return -1;
        }else {
            Integer hand1Result = hand1Faces.stream().reduce(0, Integer::sum);
            Integer hand2Result = hand2Faces.stream().reduce(0, Integer::sum);
            return hand1Result.compareTo(hand2Result);
        }
    }
}

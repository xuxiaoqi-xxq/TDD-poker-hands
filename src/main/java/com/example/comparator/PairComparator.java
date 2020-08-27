package com.example.comparator;

import com.example.entity.PorkerHand;

import java.util.Comparator;
import java.util.List;

public class PairComparator implements Comparator<PorkerHand> {

    private Integer isPair(List<Integer> faces) {
        int[] nums = new int[15];
        for (Integer face : faces) {
            nums[face]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int compare(PorkerHand porkerHand1, PorkerHand porkerHand2) {
        List<Integer> hand1Faces = porkerHand1.getFaces();
        List<Integer> hand2Faces = porkerHand2.getFaces();
        Integer hand1Pair = isPair(hand1Faces);
        Integer hand2Pair = isPair(hand2Faces);
        if(hand1Pair.equals(-1) && hand2Pair.equals(-1)){
            return 0;
        }else if(hand1Pair.equals(-1)){
            return -1;
        }else if (hand2Pair.equals(-1)) {
            return 1;
        } else {
            if (hand1Pair > hand2Pair) {
                return 1;
            } else if (hand1Pair < hand2Pair) {
                return -1;
            } else {
                return compareHighScore(hand1Faces, hand2Faces);
            }
        }
    }

    private int compareHighScore(List<Integer> hand1Faces, List<Integer> hand2Faces) {
        return hand2Faces.stream().max(Integer::compareTo).orElse(0).compareTo(hand1Faces.stream().max(Integer::compareTo).orElse(0));
    }
}

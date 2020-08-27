package com.example.comparator;

import com.example.entity.PorkerHand;

import java.util.Comparator;

public class FlushComparator implements Comparator<PorkerHand> {


    public static final String FLUSH_REGEX = "^((H{5})|(S{5})|(C{5})|(D{5}))$";

    @Override
    public int compare(PorkerHand porkerHand1, PorkerHand porkerHand2) {
        boolean isAllSameSuit1 = porkerHand1.getSuits().matches(FLUSH_REGEX);
        boolean isAllSameSuit2 = porkerHand2.getSuits().matches(FLUSH_REGEX);
        if (isAllSameSuit1 && isAllSameSuit2) {
            return porkerHand1.getFaces().get(4).compareTo(porkerHand2.getFaces().get(4));
        } else if (isAllSameSuit1) {
            return 1;
        } else if (isAllSameSuit2) {
            return -1;
        }
        return 0;
    }
}

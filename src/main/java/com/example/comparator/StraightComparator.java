package com.example.comparator;

import com.example.entity.PorkerHand;

import java.util.Comparator;
import java.util.List;

public class StraightComparator implements Comparator<PorkerHand> {
    @Override
    public int compare(PorkerHand porkerHand1, PorkerHand porkerHand2) {
        boolean isContinuousNumber1 = isContinuousNumber(porkerHand1.getFaces());
        boolean isContinuousNumber2 = isContinuousNumber(porkerHand2.getFaces());
        if (isContinuousNumber1 && isContinuousNumber2) {
            return porkerHand1.getFaces().get(4).compareTo(porkerHand2.getFaces().get(4));
        } else if (isContinuousNumber1) {
            return 1;
        } else if (isContinuousNumber2) {
            return -1;
        }
        return 0;
    }

    private boolean isContinuousNumber(List<Integer> faces) {
        for (int i = 0; i < faces.size() - 1; i++) {
            if (faces.get(i) - faces.get(i + 1) != -1) {
                return false;
            }
        }
        return true;
    }
}

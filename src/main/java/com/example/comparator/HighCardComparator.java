package com.example.comparator;

import com.example.entity.PorkerHand;

import java.util.Comparator;
import java.util.List;

public class HighCardComparator implements Comparator<PorkerHand> {
    @Override
    public int compare(PorkerHand porkerHand1, PorkerHand porkerHand2) {
        List<Integer> faces1 = porkerHand1.getFaces();
        List<Integer> faces2 = porkerHand2.getFaces();
        for (int i = faces1.size() - 1; i >= 0; i--) {
            if (faces1.get(i) > faces2.get(i)) {
                return 1;
            } else if (faces1.get(i) < faces2.get(i)) {
                return -1;
            }
        }
        return 0;
    }
}

package com.example.comparator;

import com.example.entity.PorkerHand;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

public class FourComparator implements Comparator<PorkerHand> {

    @Override
    public int compare(PorkerHand porkerHand1, PorkerHand porkerHand2) {
        List<Integer> faces1 = porkerHand1.getFaces();
        List<Integer> faces2 = porkerHand2.getFaces();
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>(faces1);
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(faces2);
        boolean isSameNumber1 = set1.size() == 2;
        boolean isSameNumber2 = set2.size() == 2;
        if (isSameNumber1 && isSameNumber2) {
           return faces1.get(2).compareTo(faces2.get(2));
        } else if (isSameNumber1) {
            return 1;
        } else if (isSameNumber2) {
            return -1;
        }
        return 0;
    }
}

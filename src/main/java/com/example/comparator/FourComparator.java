package com.example.comparator;

import com.example.entity.PorkerHand;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FourComparator implements Comparator<PorkerHand> {

    boolean isFour(List<Integer> faces){
        int[] nums = new int[15];
        for(int i = 0;i<faces.size();i++){
            nums[faces.get(i)]++;
        }
        for (int num : nums) {
            if (num == 4) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compare(PorkerHand porkerHand1, PorkerHand porkerHand2) {
        List<Integer> faces1 = porkerHand1.getFaces();
        List<Integer> faces2 = porkerHand2.getFaces();
        boolean isFour1 = isFour(faces1);
        boolean isFour2 = isFour(faces2);
        if (isFour1 && isFour2) {
            if (faces1.get(2) > faces2.get(2)) {
                return 1;
            } else if (faces1.get(2) < faces1.get(2)) {
                return -1;
            } else {
                Integer intFaces1 = Integer.valueOf(faces1.stream().map(face -> String.valueOf(face)).collect(Collectors.joining()));
                Integer intFaces2 = Integer.valueOf(faces2.stream().map(face -> String.valueOf(face)).collect(Collectors.joining()));
                return intFaces1.compareTo(intFaces2);
            }
        } else if (isFour1) {
            return 1;
        } else if (isFour2) {
            return -1;
        }
        return 0;
    }
}

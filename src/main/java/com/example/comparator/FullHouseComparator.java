package com.example.comparator;

import com.example.entity.PorkerHand;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FullHouseComparator implements Comparator<PorkerHand> {

    @Override
    public int compare(PorkerHand porkerHand1, PorkerHand porkerHand2) {
        List<Integer> faces1 = porkerHand1.getFaces();
        List<Integer> faces2 = porkerHand2.getFaces();
        HashSet<Integer> faceSet1 = new HashSet<>(faces1);
        HashSet<Integer> faceSet2 = new HashSet<>(faces2);
        boolean isFullHouse1 = faceSet1.size() == 2;
        boolean isFullHouse2 = faceSet2.size() == 2;
        if(isFullHouse1 && isFullHouse2) {
            if (faces1.get(2) > faces2.get(2)) {
                return 1;
            } else if (faces1.get(2) < faces2.get(2)) {
                return -1;
            } else {
                Integer intFaces1 = Integer.valueOf(faces1.stream().map(face -> String.valueOf(face)).collect(Collectors.joining()));
                Integer intFaces2 = Integer.valueOf(faces2.stream().map(face -> String.valueOf(face)).collect(Collectors.joining()));
                return intFaces1.compareTo(intFaces2);
            }
        }else if(isFullHouse1) {
            return 1;
        }else if(isFullHouse2){
            return -1;
        }
        return 0;
    }
}

package com.example.util;

import com.example.entity.PorkerHand;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class PorkerHandUtil {
    private static HashMap<String, Integer> map = new HashMap<String, Integer>() {
        {
            this.put("2", 2);
            this.put("3", 3);
            this.put("4", 4);
            this.put("5", 5);
            this.put("6", 6);
            this.put("7", 7);
            this.put("8", 8);
            this.put("9", 9);
            this.put("T", 10);
            this.put("J", 11);
            this.put("Q", 12);
            this.put("K", 13);
            this.put("A", 14);
        }
    };

    public static PorkerHand parse(String stringPorkerHand) {
        String suits = Arrays.stream(stringPorkerHand.split(" ")).map(card -> card.substring(1, 2)).collect(Collectors.joining());
        List<Integer> faceList = Arrays.stream(stringPorkerHand.split(" ")).map(card -> card.substring(0, 1)).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o1) - map.get(o2);
            }
        }).map(face -> map.get(face)).collect(Collectors.toList());
        PorkerHand porkerHand = new PorkerHand();
        porkerHand.setFaces(faceList);
        porkerHand.setSuits(suits);
        return porkerHand;
    }
}

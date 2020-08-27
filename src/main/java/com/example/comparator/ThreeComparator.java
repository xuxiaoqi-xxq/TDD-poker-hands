package com.example.comparator;

import com.example.entity.PorkerHand;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeComparator implements Comparator<PorkerHand> {
    @Override
    public int compare(PorkerHand porkerHand1, PorkerHand porkerHand2) {
        boolean hasThree1 = hasThree(porkerHand1.getFaces());
        boolean hasThree2 = hasThree(porkerHand2.getFaces());
        if (hasThree1 && hasThree2) {
            return porkerHand1.getFaces().get(2).compareTo(porkerHand2.getFaces().get(2));
        } else if (hasThree1) {
            return 1;
        } else if (hasThree2) {
            return -1;
        }
        return 0;
    }

    private boolean hasThree(List<Integer> faces) {
        int[] nums = new int[15];
        for (int i = 0; i < faces.size(); i++) {
            nums[faces.get(i)]++;
        }
        for (int num : nums) {
            if (num == 3) {
                return true;
            }
        }
        return false;
    }
}

package com.example;

import com.example.comparator.*;
import com.example.entity.PorkerHand;
import com.example.util.PorkerHandUtil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo {
    private static final List<Comparator<PorkerHand>> comparatorList = Arrays.asList(
            new StraightComparator(),
            new FourComparator(),
            new FullHouseComparator(),
            new FlushComparator(),
            new StraightComparator(),
            new ThreeComparator(),
            new TwoPairComparator(),
            new PairComparator(),
            new HighCardComparator()
    );

    public int compare(String porkerHand1,String porkerHand2){
        return comparatorList.stream().mapToInt(comparator -> comparator.compare(PorkerHandUtil.parse(porkerHand1), PorkerHandUtil.parse(porkerHand2))).filter(result -> result != 0).findFirst().orElse(0);
    }
}

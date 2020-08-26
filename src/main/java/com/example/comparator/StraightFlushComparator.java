package com.example.comparator;

import com.example.entity.PorkerHand;

import java.util.Comparator;
import java.util.List;

public class StraightFlushComparator implements Comparator<PorkerHand> {

    private boolean isContinuousNumber(List<Integer> numbers){
        for(int i = 0;i<numbers.size()-1;i++){
            Integer a = numbers.get(i);
            Integer b = numbers.get(i+1);
            if(a-b!=-1){
                return false;
            }
        }
        return true;
    }

    @Override
    public int compare(PorkerHand porkerHand1, PorkerHand porkerHand2) {
        boolean isSuit1 = porkerHand1.getSuits().matches("^.{5}$");
        boolean isSuit2 = porkerHand2.getSuits().matches("^.{5}$");
        boolean isContinuousNumber1 = isContinuousNumber(porkerHand1.getFaces());
        boolean isContinuousNumber2 = isContinuousNumber(porkerHand2.getFaces());
        if(isSuit1 && isSuit2) {
           if(isContinuousNumber1 && isContinuousNumber2){
               return porkerHand1.getFaces().get(0).compareTo(porkerHand2.getFaces().get(0));
           }else if(isContinuousNumber1){
               return 1;
           }else if(isContinuousNumber2){
               return -1;
           }else {
               return 0;
           }
        } else if(isSuit1) {
            return isContinuousNumber1?1:0;
        } else if(isSuit2) {
            return isContinuousNumber2?-1:0;
        }
        return 0;
    }
}

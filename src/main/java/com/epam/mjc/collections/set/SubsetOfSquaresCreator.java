package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
   TreeSet<Integer> integerSet=new TreeSet<>();
        System.out.println(sourceList);
        System.out.println(lowerBound);
        System.out.println(upperBound);
   for (int i:sourceList){
       if ((Math.abs(i)*Math.abs(i)>=lowerBound&&Math.abs(i)*Math.abs(i)<=upperBound)){
           integerSet.add(i * i);
       }

   }


   return integerSet;

    }
}

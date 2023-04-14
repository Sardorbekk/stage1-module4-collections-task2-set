package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        for (int x : sourceList) {
            //`x`, `x/2`, `(x/2)/2`
            if (x % 2 == 0) {
                while (x % 2 == 0) {
                    integerHashSet.add(x);
                    x /= 2;

                }
                integerHashSet.add(1);
            } else {
                integerHashSet.add(x);
                integerHashSet.add(2 * x);

            }


        }

        return integerHashSet;
    }
}

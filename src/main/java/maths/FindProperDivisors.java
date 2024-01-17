package maths;

import java.util.ArrayList;
import java.util.List;

public class FindProperDivisors {

    public List<Integer> findProperDivisors(final int value) {
        final List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= value / 2; i++) {
            if(value % i == 0){
                divisors.add(i);
            }
        }
        return divisors;
    }

}


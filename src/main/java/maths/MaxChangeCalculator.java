package maths;

import java.util.*;
import java.util.stream.Collectors;

public class MaxChangeCalculator {
    static int getMaxPossibleValue(List<Integer> coins){
        List<Integer> sortedCoins = coins.stream().sorted().collect(Collectors.toList());
        int maxPossibleValue = 0;

        for (int i = 0; i < sortedCoins.size(); i++) {
            int currentValue = sortedCoins.get(i);
            if(currentValue > maxPossibleValue + 1) break;
            maxPossibleValue += currentValue;
        }

        return maxPossibleValue;
    }

    public static void main(String[] args) {
        int maxPossibleValue = getMaxPossibleValue(List.of(1, 1, 1, 1, 5, 10, 20, 50));
        System.out.println(maxPossibleValue);
    }
}

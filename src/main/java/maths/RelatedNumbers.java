package maths;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RelatedNumbers {
    private FindProperDivisors findProperDivisors;

    public RelatedNumbers() {
        findProperDivisors = new FindProperDivisors();
    }

    public Map<Integer, Integer> calcFriendsUpto(int range) {
        Map<Integer, Integer> sumOfDivisors = new HashMap<>();
        Map<Integer, Integer> friends = new TreeMap<>();


        for (int num = 2; num < range; num++) {
            sumOfDivisors.put(num, findProperDivisors
                    .findProperDivisors(num).stream()
                    .sorted().reduce(0, (a, b) -> a + b));
        }

        for (int num = 2; num < range; num++) {
            List<Integer> divisors = findProperDivisors.findProperDivisors(num);
            int sumDiv1 = divisors.stream().reduce(0, (a, b) -> a + b);
            List<Integer> divisorsSumDiv1 = findProperDivisors.findProperDivisors(sumDiv1);
            int sumDiv2 = divisorsSumDiv1.stream().reduce(0, (a, b) -> a + b);
            if(sumDiv2 == num && sumDiv1 != sumDiv2){
                friends.put(num, sumDiv1);
            }
        }
        return friends;
    }
}

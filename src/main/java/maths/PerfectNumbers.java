package maths;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumbers {
    FindProperDivisors findProperDivisors;

    public PerfectNumbers() {
        this(new FindProperDivisors());
    }

    public PerfectNumbers(FindProperDivisors findProperDivisors) {
        this.findProperDivisors = findProperDivisors;
    }

    public List<Integer> calcPerfectNumbers(int number){
        List<Integer> perfectNumbers = new ArrayList<>();
        for(int num = 2; num < number; num++) {
            List<Integer> properDivisors = findProperDivisors.findProperDivisors(num);
            int divisorsSum = properDivisors.stream().reduce(0, (num1, num2) -> num1 + num2);
            if (num == divisorsSum) {
                perfectNumbers.add(num);
            }
        }
        return perfectNumbers;
    }

    public static void main(String[] args) {
        PerfectNumbers perfectNumbers = new PerfectNumbers();
        var result = perfectNumbers.calcPerfectNumbers(1000);
        System.out.println(result);
    }
}

package maths;

import java.util.*;

public class CalcSumAndCountOfNaturalNumbersDivisibleBy2or7 {

    enum ReturnCode {SUM, COUNT};

    Map<ReturnCode, Integer> calcSumAndCountAllNumbersDivBy_2_Or_7(int number){
        int count = 0;
        int sum = 0;

        for(int num = 1; num < number; num++) {
            if (isDivisibleBy2(num) || isDivisibleBy7(num)) {
                count++;
                sum += num;
            }
        }

        return Map.of(ReturnCode.COUNT, count, ReturnCode.SUM, sum);
    }

    boolean isDivisibleBy2(int num){
        return num % 2 == 0;
    }

    boolean isDivisibleBy7(int num){
        return num % 7 == 0;
    }
}

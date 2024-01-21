package maths;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface CubicFunction{
    int calc(int x, int y, int z);
}

@FunctionalInterface
interface NumericValue{
    int calc(int x, int y, int z);
}

public class ArmstrongNumbers {
    static List<Integer> calcArmstrongNumbers(){
        List<Integer> armStrongNumbers = new ArrayList<>();
        for (int num = 100; num < 1000; num++) {
            int remainder = num;
            int sum = 0;
            while(remainder > 0){
                sum += Math.pow(remainder % 10, 3);
                remainder /= 10;
            }
            if(sum == num){
                armStrongNumbers.add(num);
            }
        }
        return armStrongNumbers;
    }
    
    static List<Integer> calcArmstrongNumbers2(){
        List<Integer> armStrongNumbers = new ArrayList<>();
        for (int x = 1; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                for (int z = 0; z < 10; z++) {
                    final int numericValue = x * 100 + y * 10 + z;
                    final int cubicValue = x*x*x + y*y*y + z*z*z;
                    if(numericValue == cubicValue){
                        armStrongNumbers.add(numericValue);
                    }
                }
            }
        }
        return armStrongNumbers;
    }

    static List<Integer> calcArmstrongNumbers3(){
        final List<Integer> results = new ArrayList<>();
        CubicFunction cubeOf = (x, y, z) -> ((x * x * x) + (y * y * y) + (z * z * z));
        NumericValue numericOf = (x, y, z) -> 100 * x + 10 * y + z;

        for (int x = 1; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                for (int z = 0; z < 10; z++) {
                    int numericValue = numericOf.calc(x, y, z);
                    int cubicValue = cubeOf.calc(x, y, z);
                    if(numericValue == cubicValue) results.add(numericValue);
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        System.out.println(calcArmstrongNumbers2());
        System.out.println(calcArmstrongNumbers3());
    }
}

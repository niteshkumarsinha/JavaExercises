package recursion;

import java.util.Arrays;

public class SumOfNumbers {

    public static int sum(final int n){
        if (n <= 0)
            throw new IllegalArgumentException("n must be >= 1");
        if(n == 1) return 1;
        return n + sum(n-1);
    }

    public static int sumOfArrayRec(int[] array){
        if(array.length == 0) return 0;
        return array[array.length - 1] + sumOfArrayRec(Arrays.copyOfRange(array, 0, array.length - 1));
    }

    public static void main(String[] args) {
        int sum = sumOfArrayRec(new int[]{1, 2, 3});
        sum = sumOfArrayRec(new int[]{1, 2, 3, -7});
        System.out.println(sum);
    }
}

package recursion;

public class SumOfNumbers {

    public static int sum(final int n){
        if (n <= 0)
            throw new IllegalArgumentException("n must be >= 1");
        if(n == 1) return 1;
        return n + sum(n-1);
    }
}

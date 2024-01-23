package recursion;

public class Factorial {
    public static int factorial(final int n){
        if(n < 0){
            throw new IllegalArgumentException("n must be >= 0");
        }
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}

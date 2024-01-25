package recursion;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n < 1) throw new IllegalArgumentException("number must be >= 1");
        if(n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacciIter(int num){
        if (num <= 0)
            throw new IllegalArgumentException("n must be >= 1");

        int firstNum = 1;
        int secondNum = 1;

        if(num == 1 || num == 2){
            return 1;
        }

        int fibn = 0;

        for (int n = 3; n <= num; n++){
            fibn = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = fibn;
        }
        return fibn;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciIter(8));
    }
}

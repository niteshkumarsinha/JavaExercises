package recursion;

public class Exponential {
    boolean isPowerOf2(int num){
        if(num < 2)
            return num == 1;
        if(num % 2 != 0)
            return false;
        return isPowerOf2(num / 2);
    }

    static long powerOf(int value, int exponent){
        if (exponent < 0)
            throw new IllegalArgumentException("exponent must be >= 0");
        if(exponent == 0) return 1;
        if(exponent == 1) return value;
        return value * powerOf(value, exponent - 1);
    }

    static long powerOfOptimized(final long value, final long exponent){
        if(exponent < 0)
            throw new IllegalArgumentException("exponent must be >= 0");
        if(exponent == 0) return 1;
        if(exponent == 1) return value;
        long result = powerOfOptimized(value * value, exponent / 2);
        if(exponent % 2 == 1){
            return result * value;
        }
        return result;
    }

    int powerOfIterative(int value, int exponent){
        int result = 1;
        while (exponent > 0){
            result *= value;
            exponent--;
        }
        return result;
    }
}

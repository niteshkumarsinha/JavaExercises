package maths;

public class PrimeNumber {
    boolean isPrime(final int potentiallyPrime){
        for (int i = 2; i <= potentiallyPrime / 2; i++) {
            if(potentiallyPrime % i == 0){
                return false;
            }
        }
        return true;
    }
}

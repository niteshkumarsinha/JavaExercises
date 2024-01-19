package maths;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    boolean isPrime(final int potentiallyPrime){
        for (int i = 2; i <= potentiallyPrime / 2; i++) {
            if(potentiallyPrime % i == 0){
                return false;
            }
        }
        return true;
    }

    List<Integer> calcPrimesUpto(int range){
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i < range; i++) {
            if(isPrime(i)){
                primeNumbers.add(i);
            }
        }
        if(isPrime(range)){
            primeNumbers.add(range);
        }
        return primeNumbers;
    }
}

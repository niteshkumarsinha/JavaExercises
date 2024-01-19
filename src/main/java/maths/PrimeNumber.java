package maths;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PrimeNumber {
    boolean isPrime(final int potentiallyPrime){
        if(potentiallyPrime < 2) return false;
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

    enum PrimePairType {
        TWIN(2),
        COUSIN(4),
        SEXY(6);

        int val;
        PrimePairType(int i) {
            val = i;
        }
    }

    public String primePairs(int range, PrimePairType pairType){
        String primePairs = "";
        for (int i = 1; i <= range; i++) {
            if(isPrime(i) && isPrime(i + pairType.val)){
                primePairs += i + "=" + (i + pairType.val) + ", ";
            }
        }
        primePairs = primePairs.trim();
        return primePairs.substring(0, primePairs.length() - 1);
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        var primePairs = primeNumber.primePairs(50, PrimePairType.TWIN);
        System.out.println(primePairs);
    }
}

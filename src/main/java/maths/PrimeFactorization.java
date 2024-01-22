package maths;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeFactorization {
    PrimeNumber primeNumber;

    public PrimeFactorization() {
        this.primeNumber = new PrimeNumber();
    }

    List<Integer> calcPrimeFactors(int num){
        List<Integer> allPrimes = primeNumber.calcPrimesUpto(num).stream().sorted().collect(Collectors.toList());;
        final List<Integer> primeFactors = new ArrayList<>();

        int remainingValue = num;

        for(int primeNum: allPrimes) {
            while (remainingValue % primeNum == 0 && remainingValue >= 2) {
                primeFactors.add(primeNum);
                remainingValue /= primeNum;
            }
            if(remainingValue < 2) break;
        }

        return primeFactors;
    }

}

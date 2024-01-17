package maths;

public class CountDigits {
    int countDigits(final int number){
        int count = 0;
        int remainingValue = number;
        while (remainingValue > 0){
            remainingValue = remainingValue / 10;
            count++;
        }
        return count;
    }
}

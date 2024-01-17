package maths;

public class ExtractDigits {
    void extractDigits(final int startValue){
        int remainingValue = startValue;
        while(remainingValue > 0){
            final int digit = remainingValue % 10;
            System.out.println(digit + " ");
            remainingValue = remainingValue / 10;
        }
        System.out.println();
    }
}

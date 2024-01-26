package recursion;

import java.util.Arrays;

public class NumberPalindromes {
    boolean isNumberPalindromeString(int number){
        if(number >= 0 && number < 10) return true;
        String numberString = String.valueOf(number);
        if(numberString.charAt(0) == numberString.charAt(numberString.length() - 1)){
            String numString = numberString.substring(1, numberString.length() - 1);
            if(numString.equals(""))
                return true;
            return isNumberPalindromeString(Integer.parseInt(numString));
        }
        return false;
    }

    boolean isNumberPalindrome(int number){
        if(number < 10) return true;
        int factor = getPowerOfTen(number);
        int divisor = (int) Math.pow(10, factor);
        if(number > 10){
            final int leftNumber = number / divisor;
            final  int rightNumber = number % 10;
            int remainingNumber = (number / divisor) % (10);
            return leftNumber == rightNumber && isNumberPalindromeString(remainingNumber);
        }
        return false;
    }

    private int getPowerOfTen(int number) {
        int pow = 0;
        while(number > 0){
            number /= 10;
            pow++;
        }
        return pow - 1;
    }

    public static void main(String[] args) {
        boolean isPalindrome = new NumberPalindromes().isNumberPalindrome(7);
        System.out.print(7 + ": ");
        System.out.println(isPalindrome);
        isPalindrome = new NumberPalindromes().isNumberPalindrome(13);
        System.out.print(13 + ": ");
        System.out.println(isPalindrome);
        isPalindrome = new NumberPalindromes().isNumberPalindrome(171);
        System.out.print(171 + ": ");
        System.out.println(isPalindrome);
        isPalindrome = new NumberPalindromes().isNumberPalindrome(4774);
        System.out.print(4774 + ": ");
        System.out.println(isPalindrome);
        isPalindrome = new NumberPalindromes().isNumberPalindrome(47742);
        System.out.print(47742 + ": ");
        System.out.println(isPalindrome);
    }
}

package strings;

import java.util.Locale;

public class NumberConversions {
    boolean isBinaryNumber(String number){
        char[] chars = number.toCharArray();
        for(char ch: chars){
            if(!(ch == '0' || ch == '1')){
                return false;
            }
        }
        return true;
    }

    int binaryToDecimal(String number){
        if (!isBinaryNumber(number))
            throw new IllegalArgumentException(number + " is not a binary number");

        char[] chars = number.toCharArray();
        int value = 0;
        for (int i = 0; i < chars.length; i++) {
            value = value * 2 + Character.getNumericValue(chars[i]);
        }
        return value;
    }

    int hexToDecimal(String number){
        if (!isHexNumber(number))
            throw new IllegalArgumentException(number + " is not a hex number");

        char[] chars = number.toCharArray();
        int value = 0;
        for (int i = 0; i < chars.length; i++) {
            value = value * 16 + Character.getNumericValue(chars[i]);
        }
        return value;
    }

    private boolean isHexNumber(String number) {
        String upperCaseNumber = number.toUpperCase(Locale.ROOT);
        boolean isHex = true;
        for (int i = 0; i < upperCaseNumber.length(); i++) {
            char currentChar = upperCaseNumber.charAt(i);
            int numericValue = Character.getNumericValue(currentChar);
            isHex = numericValue >= 0 && numericValue < 16;
            if(!isHex) break;
        }
        return isHex;
    }

    public static void main(String[] args) {
        System.out.println(new NumberConversions().isBinaryNumber("101011"));
        System.out.println(new NumberConversions().isBinaryNumber("110110"));
        System.out.println(new NumberConversions().isBinaryNumber("10112"));
        System.out.println(new NumberConversions().binaryToDecimal("101011"));
        System.out.println(new NumberConversions().hexToDecimal("AB"));
    }
}

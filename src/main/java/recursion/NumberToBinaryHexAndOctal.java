package recursion;

import java.util.stream.IntStream;

public class NumberToBinaryHexAndOctal {
    String toBinary(int number){
        String binaryRepr = "";
        int quotient = number;
        while (quotient != 0) {
            int remainder = quotient % 2;
            quotient = quotient / 2;
            binaryRepr = remainder + binaryRepr;
        }
        return binaryRepr;
    }

    String toBinaryRec(int number){
        if(number < 0){
            throw new IllegalArgumentException("n must be >= 0");
        }
        if(number <= 1){
            return String.valueOf(number);
        }

        final int remainder = number % 2;
        return toBinaryRec(number / 2) + remainder;
    }

    String toOctal(int number){
        if (number < 0)
            throw new IllegalArgumentException("n must be >= 0");
        if (number < 8)
            return String.valueOf(number);

        final int lastDigit = number % 8;
        return toOctal(number / 8) + String.valueOf(lastDigit);
    }

    String toHex(int number){
        if (number < 0)
            throw new IllegalArgumentException("n must be >= 0");
        if (number <= 15)
            return asHexDigit(number);

        final int lastDigit = number % 16;
        return toHex(number / 16) + asHexDigit(lastDigit);
    }

    private String asHexDigit(final int lastDigit){
        if(lastDigit <= 15){
            final char hexDigit = "0123456789ABCDEF".charAt(lastDigit);
            return String.valueOf(hexDigit);
        }
        throw new IllegalArgumentException("value not in range 0 – 15, " + "but is: " + lastDigit);
    }

    private String asHexVal(int lastDigit) {
        if(lastDigit >= 0 && lastDigit < 10) return String.valueOf(lastDigit);
        else {
            String val = "";
            switch (lastDigit){
                case 10:
                    val = "A";
                    break;
                case 11:
                    val = "B";
                    break;
                case 12:
                    val = "C";
                    break;
                case 13:
                    val = "D";
                    break;
                case 14:
                    val = "E";
                    break;
                case 15:
                    val = "F";
                    break;
                default:
                    break;
            }
            return val;
        }
    }

    public static void main(String[] args) {
        System.out.println(new NumberToBinaryHexAndOctal().toOctal(22));
        System.out.println(new NumberToBinaryHexAndOctal().toHex(22));
    }
}

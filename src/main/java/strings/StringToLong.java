package strings;

public class StringToLong {
    static long strToLongV1(final String number){
        long numberLong = 0L;
        char[] numberChars = number.toCharArray();
        boolean isNegative = numberChars[0] == '-';
        if(isNegative){
            numberLong = -1 * getLongRepr(numberChars, numberLong);
        }else{
            numberLong = getLongRepr(numberChars, numberLong);
        }
        return numberLong;
    }

    static long getLongRepr(char[] numberChars, long numberLong){
        boolean isOctal = numberChars[0] == '0' ||
                numberChars[0] == '-' && numberChars[1] == '0' ||
                numberChars[0] == '+' && numberChars[1] == '0';
        boolean isNegative = numberChars[0] == '-';
        boolean isValidNumber = numberChars[0] == '0' ||
                numberChars[0] == '-' ||
                numberChars[0] == '+' ||
                Character.isDigit(numberChars[0]);
        if(!isValidNumber) throw new IllegalArgumentException("Invalid number");
        String errMsg = "";
        long multiplier = 10;
        if(isOctal) errMsg = "invalid octal number";
        if(isOctal) multiplier = 8;
        if(isNegative) errMsg = "invalid decimal number";
        int pos = 0;
        for(int idx = numberChars.length - 1; idx > 0; idx--){
            if(Character.isDigit(numberChars[idx])){
                numberLong += Character.getNumericValue(numberChars[idx]) * Math.pow(multiplier, pos++);
            }else {
                throw new IllegalArgumentException(errMsg);
            }
        }
        if(Character.isDigit(numberChars[0])) {
            numberLong += Character.getNumericValue(numberChars[0]) * Math.pow(multiplier, pos);
        }
        return numberLong;
    }

    public static void main(String[] args) {

    }
}

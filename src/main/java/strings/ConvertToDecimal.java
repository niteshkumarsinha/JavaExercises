package strings;

public class ConvertToDecimal {
    static int convertToDecimal(final String hexDigits){
        int valueOldStyle = 0;
        int valueNewStyle = 0;

        for (int i = 0; i < hexDigits.length(); i++) {
            final char currentChar = hexDigits.charAt(i);
            int digitValueOld = hexDigitToDecimal(currentChar);
            valueOldStyle = valueOldStyle * 16 + digitValueOld;

            //NEW
            int digitValueNew = Character.getNumericValue(currentChar);
            valueNewStyle = valueNewStyle * 16 + digitValueNew;

        }
        return valueNewStyle;
    }

    //OLD
    private static int hexDigitToDecimal(char currentChar) {
        if(Character.isDigit(currentChar)){
            return currentChar - '0';
        }
        return currentChar - 'A' + 10;
    }

    private static int hexDigitToDecimalAlternative(final char hexDigit){
        final int position = "0123456789ABCDEF".indexOf(hexDigit);
        if(position < 0){
            throw new IllegalArgumentException("invalid char: " + hexDigit);
        }
        return position;
    }
}

package maths;

import java.util.Map;

public class NumberAsText {
    static Map<Integer, String> numberToText = Map.of(
            0, "ZERO",
            1, "ONE",
            2, "TWO",
            3, "THREE",
            4, "FOUR",
            5, "FIVE",
            6, "SIX",
            7, "SEVEN",
            8, "EIGHT",
            9, "NINE"
    );

    static String numberAsText(final int n){
        String value = "";
        int remainingValue = n;
        while (remainingValue > 0){
            String remainderAsText = getRemainderAsText(remainingValue % 10);
            remainingValue = remainingValue / 10;
            value = remainderAsText + " " + value;
        }
        return value.trim();
    }

    private static String getRemainderAsText(int num) {
        return numberToText.get(num);
    }
}

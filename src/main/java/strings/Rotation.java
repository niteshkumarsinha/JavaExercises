package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Rotation {
    static boolean containsRotation(String first, String second){
        List<String> rotations = new ArrayList<>();
        boolean contains = false;
        char[] firstChars = first.toLowerCase().toCharArray();
        int length = firstChars.length;

        StringBuilder stringBuilder;
        int startIdx = 0;
        int len = 0;
        while (startIdx < length) {
            stringBuilder = new StringBuilder();
            for (int idx = startIdx; len < firstChars.length; idx = (idx + 1) % length, len++) {
                stringBuilder.append(firstChars[idx]);
            }
            String rotationString = stringBuilder.toString();
            rotations.add(rotationString);
            len = 0;
            startIdx++;
        }

        for(String string: rotations){
            char[] stringchars = string.toCharArray();
            char[] secondChars = second.toLowerCase().toCharArray();
            int idx = 0;
            while (idx < secondChars.length){
                if(secondChars[idx] != stringchars[idx]){
                    break;
                }
                idx++;
            }
            if(idx == secondChars.length){
                contains = true;
            }
        }

        return contains;
    }


    boolean containsRotation2(String first, String second){
        final String doubleString = (first + first).toLowerCase(Locale.ROOT);
        return doubleString.contains(second.toLowerCase(Locale.ROOT));
    }

    public static void main(String[] args) {
        String first = "ABCD";
        String second = "ABC";
        System.out.println(containsRotation(first, second));
    }
}

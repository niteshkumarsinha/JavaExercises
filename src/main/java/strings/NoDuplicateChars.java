package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class NoDuplicateChars {
    boolean checkNoDuplicateChars(String string){
        Set<Character> set = new HashSet<>();
        char[] chars = string.toLowerCase(Locale.ROOT).toCharArray();
        boolean checkNoDuplicate = true;
        for (char aChar : chars) {
            if (set.contains(aChar)) {
                checkNoDuplicate = false;
                break;
            }
            set.add(aChar);
        }
        return checkNoDuplicate;
    }

    static boolean checkNoDuplicateCharsStreamV1(final String input) {
        return input.toLowerCase()
                .chars()
                .boxed()
                .collect(Collectors.toSet())
                .size() == input.length();
    }

    boolean checkNoDuplicateCharsWithStreamOpt(final String input) {
        return input.toLowerCase().chars().distinct().count() == input.length();
    }
}

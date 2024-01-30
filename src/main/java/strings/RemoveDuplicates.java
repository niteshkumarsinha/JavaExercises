package strings;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    String removeDuplicates(String string){
        String res = "";
        Set<Character> characters = new HashSet<>();
        char[] chars = string.toCharArray();

        for(char ch: chars) {
            if (!characters.contains(ch)) {
                characters.add(ch);
                res += ch;
            }
        }
        return res;
    }

    static String removeDuplicatesImproved(final String input)
    {
        return input.chars().distinct().
                mapToObj(i -> (char) i + "").
                collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicates().removeDuplicates("bananas"));
        System.out.println(new RemoveDuplicates().removeDuplicates("lalalamama"));
        System.out.println(new RemoveDuplicates().removeDuplicates("MICHAEL"));
    }
}

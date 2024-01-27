package strings;

import java.util.Map;
import java.util.TreeMap;

public class GenerateCharacterHistogram {
    static Map<Character, Integer> generateCharacterHistogram(final String word){
        final Map<Character, Integer> charCountMap = new TreeMap<>();
        final char[] chars = word.toLowerCase().toCharArray();
        for(char currentChar: chars){
            if(Character.isLetter(currentChar)) {
                charCountMap.putIfAbsent(currentChar, 0);
                charCountMap.computeIfPresent(currentChar, (key, value) -> value + 1);
            }
        }
        return charCountMap;
    }

    public static void main(String[] args) {
        System.out.println(generateCharacterHistogram("Otto"));
        System.out.println(generateCharacterHistogram("Hello Michael"));

    }
}

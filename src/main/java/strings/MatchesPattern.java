package strings;

import java.util.HashMap;
import java.util.Map;

public class MatchesPattern {
    static boolean matchesPattern(String first, String second){
        char[] chars = first.toCharArray();
        String[] words2 = second.split(" ");
        String pattern1 = getPattern(chars);
        String pattern2 = getPattern(words2);
        return pattern1.equals(pattern2);
    }

    static private String getPattern(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int key = 1;
        Map<Character, Integer> pattern = new HashMap<>();
        for(char ch: chars){
            if(!pattern.containsKey(ch)){
                pattern.put(ch, key);
                sb.append(key);
                key++;
            }else {
                sb.append(pattern.get(ch));
            }

        }
        return sb.toString();
    }

    static private String getPattern(String[] words) {
        StringBuilder sb = new StringBuilder();
        int key = 1;
        Map<String, Integer> pattern = new HashMap<>();
        for(String word: words){
            if(!pattern.containsKey(word)){
                pattern.put(word, key);
                sb.append(key);
                key++;
            }else {
                sb.append(pattern.get(word));
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String first = "xyyx";
        String second = "tim mike mike tim";
        boolean patternCheck = new MatchesPattern().matchesPattern(first, second);
        System.out.println(patternCheck);
    }
}

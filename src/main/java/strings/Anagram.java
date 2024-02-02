package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Anagram {
    static boolean isAnagram(String first, String second){
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetsChars = alphabets.toCharArray();
        Map<Character, Integer> frequency1 = new HashMap<>();
        Map<Character, Integer> frequency2 = new HashMap<>();
        boolean anagram = true;
        char[] firstChars = first.toLowerCase().toCharArray();
        char[] secondChars = second.toLowerCase().toCharArray();

        for(char aChar: firstChars){
            if(frequency1.containsKey(aChar)) {
                frequency1.computeIfPresent(aChar, (key, value) -> value + 1);
            }else {
                frequency1.put(aChar, 1);
            }
        }

        for(char aChar: secondChars){
            if(frequency2.containsKey(aChar)) {
                frequency2.computeIfPresent(aChar, (key, value) -> value + 1);
            }else {
                frequency2.put(aChar, 1);
            }
        }

        for(char aChar: alphabetsChars){
            if((frequency1.containsKey(aChar) && !frequency2.containsKey(aChar))
                    || (!frequency1.containsKey(aChar) && frequency2.containsKey(aChar))){
                anagram = false;
                break;
            }
            if(frequency1.containsKey(aChar) && frequency2.containsKey(aChar)){
                anagram = Objects.equals(frequency1.get(aChar), frequency2.get(aChar));
                if(!anagram) break;
            }
        }
        return anagram;
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        boolean isAnagram = anagram.isAnagram("Otto", "Toto");
        System.out.println(isAnagram);

        isAnagram = anagram.isAnagram("Mary", "Army");
        System.out.println(isAnagram);

        isAnagram = anagram.isAnagram("Ananas", "Bananas");
        System.out.println(isAnagram);
    }
}

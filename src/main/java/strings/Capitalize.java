package strings;

import java.util.ArrayList;
import java.util.List;

public class Capitalize {
    String capitalize(String title){
        StringBuilder result = new StringBuilder();
        char[] chars = title.toCharArray();
        int idx = 0;
        while (idx < chars.length){
            if(idx == 0 || (idx > 0 && Character.isLetter(chars[idx]) && String.valueOf(chars[idx - 1]).equals(" "))){
                result.append(Character.toUpperCase(chars[idx++]));
            }else{
                result.append(chars[idx++]);
            }
        }
        return result.toString();
    }

    List<String> capitalize(List<String> words){
        List<String> result = new ArrayList<>();
        for(String word: words){
            result.add(capitalize(word));
        }
        return result;
    }

    List<String> capitalize(List<String> words, List<String> toBeExcluded){
        List<String> result = new ArrayList<>();
        for(String word: words){
            if(!toBeExcluded.contains(word)){
                result.add(capitalize(word));
            }else {
                result.add(word);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Capitalize().capitalize("this is a very special title"));
        System.out.println(new Capitalize().capitalize(List.of("this", "is", "a", "very", "special", "title")));
        System.out.println(new Capitalize().capitalize(List.of("this", "is", "a", "very", "special", "title"), List.of("is", "a")));
    }
}

package recursion;

import java.util.HashSet;
import java.util.Set;

public class Permutations {
    static Set<String> calcPermutations(final String input){
        if(input.equals("") || input.length() == 1) return Set.of(input);
        Set<String> combinations = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            String iThChar = String.valueOf(input.charAt(i));
            String newInput = input.substring(0, i) + input.substring(i + 1);
            Set<String> permutations = calcPermutations(newInput);
            for(String perm: permutations){
                combinations.add(iThChar + perm);
            }
        }
        return combinations;
    }

    static Set<String> calcPermutationsOptimized(final String remaining, final String prefix){
        if(remaining.equals("")){
            return Set.of(prefix);
        }
        Set<String> combinations = new HashSet<>();
        for (int i = 0; i < remaining.length(); i++) {
            String newPrefix = prefix + remaining.charAt(i);
            String newInput = remaining.substring(0, i) + remaining.substring(i + 1);
            Set<String> permutations = calcPermutationsOptimized(newInput, newPrefix);
            combinations.addAll(permutations);
        }
        return combinations;
    }

    public static void main(String[] args) {
        System.out.println(calcPermutations("abc"));
        System.out.println(calcPermutationsOptimized("abc", ""));
    }
}

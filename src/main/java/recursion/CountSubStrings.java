package recursion;

public class CountSubStrings {
    static int countSubstrings(final String input, final String valueToFind){
        if(input.length() < valueToFind.length()) return 0;
        int count = 0;
        final String remaining;
        if(input.startsWith(valueToFind)){
            remaining = input.substring(valueToFind.length());
            count++;
            return count + countSubstrings(remaining, valueToFind);
        }else {
            remaining = input.substring(1);
            return count + countSubstrings(remaining, valueToFind);
        }
    }

    static int countSubStringOpt(final String input, final String valueToFind){
        return countSubStringOpt(input, valueToFind, 0);
    }

    static int countSubStringOpt(final String input, final String valueToFind, int left){
        if(input.length() - left < valueToFind.length()) return 0;
        int count = 0;
        if (input.startsWith(valueToFind, left)) {
            left += valueToFind.length();
            count++;
            return count + countSubStringOpt(input, valueToFind, left);
        } else {
            left++;
            return count + countSubStringOpt(input, valueToFind, left);
        }
    }
}

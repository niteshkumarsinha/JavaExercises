package strings;

public class CountSubStrings {
    int countSubStrings(final String input, final String valueToFind){
        if(input.length() < valueToFind.length()) return 0;
        int count;
        String remaining;
        if(input.startsWith(valueToFind)){
            remaining = input.substring(valueToFind.length());
            count = 1;
        } else {
            remaining = input.substring(1);
            count = 0;
        }
        return countSubStrings(remaining, valueToFind) + count;
    }

    int countSubStringsShort(final String input, final String valueToFind){
        return input.length() < valueToFind.length() ? 0 :
                (input.startsWith(valueToFind) ? 1: 0) + countSubStringsShort(input.substring(1), valueToFind);
    }
}

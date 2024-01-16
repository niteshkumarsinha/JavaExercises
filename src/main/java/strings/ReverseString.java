package strings;

public class ReverseString {
     public String reverseString(final String input){
        if(input.length() <= 1){
            return input;
        }
        final char firstChar = input.charAt(0);
        final String remaining = input.substring(1);
        return reverseString(remaining) + firstChar;
    }

    public String reverseStringShort(final String input){
        return input.length() <= 1 ? input :
                reverseStringShort(input.substring(1)) + input.charAt(0);
    }

}

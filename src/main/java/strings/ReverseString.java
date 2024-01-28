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

    public String reverseRec(String string){
         if(string.isEmpty()) return string;
         String firstChar = String.valueOf(string.charAt(0));
         String remaining = string.substring(1);
         return reverseRec(remaining) + firstChar;
    }

    public String reverseInPlace(final String original){
         final char[] originalChars = original.toCharArray();
         int left = 0;
         int right = originalChars.length - 1;

         while (left < right){
             final char leftChar = originalChars[left];
             final char rightChar = originalChars[right];
             originalChars[left++] = rightChar;
             originalChars[right--] = leftChar;
         }

         return String.valueOf(originalChars);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseString().reverseInPlace("ABCD"));
    }

}

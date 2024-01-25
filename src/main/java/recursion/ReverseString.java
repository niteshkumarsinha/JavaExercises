package recursion;

public class ReverseString {
    String reverseString(String string){
        if(string.length() == 0){
            return string;
        }
        return string.substring(string.length() - 1) + reverseString(string.substring(0, string.length() - 1));
    }

    String reverseString2(String string){
        if(string.length() <= 1){
            return string;
        }
        final char firstChar = string.charAt(0);
        return reverseString(string.substring(1)) + firstChar;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseString().reverseString("nitesh"));
    }
}

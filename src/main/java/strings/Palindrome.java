package strings;

public class Palindrome {
    boolean isPalindrome(String string){
        char[] chars = string.toLowerCase().toCharArray();
        int left = 0;
        int right = string.length() - 1;
        boolean isPalin = true;
        while (left < right && isPalin){
            isPalin = chars[left] == chars[right];
            left++;
            right--;
        }
        return isPalin;
    }

    boolean isPalindromeRec2(String string){
        if(string.isEmpty()) return true;
        if(string.length() == 1) return true;
        int left = 0;
        int right = string.length() - 1;
        string = string.toLowerCase();
        if(string.charAt(left) != string.charAt(right)) return false;
        return isPalindromeRec(string.substring(left++, right--));
    }

    boolean isPalindromeRec(String string){
        return isPalindromeRec(string.toLowerCase(), 0, string.length() - 1);
    }

    private boolean isPalindromeRec(String string, int left, int right) {
        if(left >= right) return true;
        if(string.charAt(left) != string.charAt(right)) return false;
        return isPalindromeRec(string, left + 1, right - 1);
    }

    public boolean isPalindromeRec(final String string, final boolean ignoreSpacesAndPunctuation){
        String adjustedInput = string.toLowerCase();
        if(ignoreSpacesAndPunctuation){
            adjustedInput = adjustedInput.replaceAll(" |!|\\.", "");
        }
        return isPalindromeRec(adjustedInput, 0, adjustedInput.length() - 1);
    }

    public static void main(String[] args) {

    }
}

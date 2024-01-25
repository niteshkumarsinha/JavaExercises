package recursion;

public class Palindrome {
    public static boolean isPalindrome(int[] numbers, int left, int right){
        if(left >= right) return true;
        if(numbers[left] == numbers[right]){
            left += 1;
            right -= 1;
            return isPalindrome(numbers, left, right);
        }
        return false;
    }

    public static boolean isPalindromeIter(int[] values){
        int left = 0;
        int right = values.length - 1;
        boolean sameValue = true;
        while (left < right && sameValue){
            sameValue = values[left] == values[right];
            left++;
            right--;
        }
        return sameValue;
    }

}

package strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIsPalindrome {
    @ParameterizedTest(name = "isPalindromeRec({0} => {1}")
    @CsvSource({ "Otto, true",
            "ABCBX, false",
            "ABCXcba, true" })
    void isPalindromeRec(String value, boolean expected)
    {
        boolean result = new Palindrome().isPalindromeRec(value);
        assertEquals(expected, result);
    }
    @ParameterizedTest(name = "''{0}'' should be {1}")
    @CsvSource( { "Dreh mal am Herd., true",
            "Das ist kein Palindrom!, false"} )
    void isPalindrome(String value, boolean expected)
    {
        boolean result = new Palindrome().isPalindromeRec(value, true);
        assertEquals(expected, result);
    }
}

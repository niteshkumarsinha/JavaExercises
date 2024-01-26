package recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumberPalindrome {
    @ParameterizedTest(name = "isNumberPalindrome({0}) => {1}")
    @CsvSource({ "7, true", "13, false", "171, true", "47742, false",
            "123321, true", "1234554321, true" })
    void isNumberPalindrome(int number, boolean expected)
    {
        boolean result = new NumberPalindromes().isNumberPalindrome(number);
        assertEquals(expected, result);
    }
}

package recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReverseString {

    @ParameterizedTest(name = "reverseString({0}) => {1}")
    @CsvSource({ "A, A", "ABC, CBA", "abcdefghi, ihgfedcba" })
    void reverseString(String input, String expected)
    {
        String result = new ReverseString().reverseString(input);
        assertEquals(expected, result);
    }
}

package recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProcessDigits {
    @ParameterizedTest(name = "countDigits({0}) = {1}")
    @CsvSource({ "1234, 4", "1234567, 7" })
    void countDigits(int number, int expected)
    {
        long result = new ProcessDigits().countDigits(number);
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "calcSumOfDigits({0}) = {1}")
    @CsvSource({ "1234, 10", "1234567, 28" })
    void calcSumOfDigits(int number, int expected)
    {
        long result = new ProcessDigits().calcSumOfDigits(number, 0);
        assertEquals(expected, result);
    }
}

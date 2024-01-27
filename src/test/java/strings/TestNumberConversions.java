package strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumberConversions {
    @ParameterizedTest(name = "isBinaryNumber({0}) => {1}")
    @CsvSource({ "10101, true", "222, false", "12345, false" })
    public void isBinaryNumber(String value, boolean expected)
    {
        boolean result = new NumberConversions().isBinaryNumber(value);
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "binaryToDecimal({0}) => {1}")
    @CsvSource({ "111, 7", "1010, 10", "1111, 15", "10000, 16" })
    public void binaryToDecimal(String value, int expected)
    {
        int result = new NumberConversions().binaryToDecimal(value);
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "hexToDecimal({0}) => {1}")
    @CsvSource({ "7, 7", "A, 10", "F, 15", "10, 16" })
    public void hexToDecimal(String value, int expected)
    {
        int result = new NumberConversions().hexToDecimal(value);
        assertEquals(expected, result);
    }
}

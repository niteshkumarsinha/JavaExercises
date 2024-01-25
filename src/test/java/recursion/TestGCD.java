package recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGCD {
    @ParameterizedTest(name = "gcd({0}, {1}) = {2}")
    @CsvSource({ "42, 7, 7", "42, 28, 14", "42, 14, 14" })
    void gcd(int a, int b, int expected)
    {
        int result = new GCD().gcdRec(a, b);
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "gcdIterative({0}, {1}) = {2}")
    @CsvSource({ "42, 7, 7", "42, 28, 14", "42, 14, 14" })
    void gcdIterative(int a, int b, int expected)
    {
        int result = new GCD().gcd(a, b);
        assertEquals(expected, result);
    }
}

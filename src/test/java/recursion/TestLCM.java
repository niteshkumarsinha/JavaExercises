package recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLCM {

    @ParameterizedTest(name = "lcm({0}, {1}) = {2}")
    @CsvSource({ "2, 7, 14", "7, 14, 14", "42, 14, 42" })
    void lcm(int a, int b, int expected)
    {
        int result = new LCM().lcm(a, b);
        assertEquals(expected, result);
    }
}

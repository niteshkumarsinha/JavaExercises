package strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCheckBraces {
    @ParameterizedTest(name = "checkBraces(''{0}'') -- hint: {2}")
    @CsvSource({ "(()), true, ok",
            "()(), true, ok",
            "(()))((()), false, not properly nested",
            "((), false, no suitable bracing" })
    void checkBraces(String input, boolean expected, String hint)
    {
        boolean result = CheckBraces.checkBraces(input);
        assertEquals(expected, result);
    }
}

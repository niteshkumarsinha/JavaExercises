package strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRotation {
    @ParameterizedTest(name = "{1} in {0}{0} => {2}")
    @CsvSource({ "ABCD, ABC, true", "ABCDEF, EFAB, true", "BCDE, EC, false",
            "Challenge, GECH, true"})
    void containsRotation(String value, String rotatedSub, boolean expected)
    {
        boolean result = Rotation.containsRotation(value, rotatedSub);
        assertEquals(expected, result);
    }
}

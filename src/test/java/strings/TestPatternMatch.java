package strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPatternMatch {
    @ParameterizedTest(name = "pattern ''{0}'' matches ''{1}'' => {2}")
    @CsvSource( {"xyyx, tim mike mike tim, true",
            "xyyx, time mike tom tim, false",
            "xyxx, tim mike mike tim, false",
            "xxxx, tim tim tim tim, true" })
    void testInputMatchesPattern(String pattern, String input, boolean expected){
        boolean result = MatchesPattern.matchesPattern(pattern, input);
        assertEquals(expected, result);
    }
}

package strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAnagram {
    @ParameterizedTest(name = "isAnagram({0}, {1}) => {2}")
    @CsvSource({ "Otto, Toto, true", "Mary, Army, true",
            "Ananas, Bananas, false" })
    void testIsAnagram(String value1, String value2, boolean expected)
    {
        boolean result = Anagram.isAnagram(value1, value2);
        assertEquals(expected, result);
    }
}

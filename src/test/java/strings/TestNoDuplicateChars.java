package strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNoDuplicateChars {

    @ParameterizedTest(name = "checkNoDuplicateChars({0}) => {1}")
    @CsvSource({ "Otto, false", "Adrian, false", "Micha, true", "ABCDEFG, true" })
    void checkNoDuplicateChars(final String input, final boolean expected)
    {
        var result = new NoDuplicateChars().checkNoDuplicateChars(input);
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "removeDuplicates({0}) => {1}")
    @CsvSource({ "bananas, bans", "lalalamama, lam", "MICHAEL, MICHAEL" })
    void testRemoveDuplicates(final String input, final String expected)
    {
        var result = new RemoveDuplicates().removeDuplicates(input);
        assertEquals(expected, result);
    }

}

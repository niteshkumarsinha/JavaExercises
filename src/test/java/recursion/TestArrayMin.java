package recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArrayMin {
    @ParameterizedTest(name="min({0}) = {1}")
    @MethodSource("valuesAndMinimum")
    void min(int[] input, int expected)
    {
        int result = new ArrayMin().min(input, Integer.MAX_VALUE);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> valuesAndMinimum()
    {
        return Stream.of(Arguments.of(new int[] { 7, 2, 1, 9, 7, 1 }, 1),
                Arguments.of(new int[] { 11, 2, 33, 44, 55, 6, 7 }, 2),
                Arguments.of(new int[] { 1, 2, 3, -7 }, -7),
        Arguments.of(new int[] { }, Integer.MAX_VALUE));
    }
}

package recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPermutations {
    @ParameterizedTest(name = "calcPermutations({0}) = {1}")
    @MethodSource("inputAndPermutations")
    void calcPermutations(String input, Set<String> expected)
    {
        Set<String> result = Permutations.calcPermutations(input);
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "calcPermutations({0}) = {1}")
    @MethodSource("inputAndPermutations")
    void calcPermutationsOptimized(String input, Set<String> expected)
    {
        Set<String> result = Permutations.calcPermutationsOptimized(input, "");
        assertEquals(expected, result);
    }

    private static Stream<Arguments> inputAndPermutations()
    {
        return Stream.of(Arguments.of("A", Set.of("A")),
                Arguments.of("AA", Set.of("AA")),
                Arguments.of("AB", Set.of("AB", "BA")),
                Arguments.of("ABC", Set.of("ABC", "BAC", "ACB",
                        "CAB", "CBA", "BCA")),
                Arguments.of("AAC", Set.of("AAC", "ACA", "CAA")));
    }

}

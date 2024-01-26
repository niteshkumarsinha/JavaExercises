package recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPascalTriangle {
    @ParameterizedTest(name = "calcPascal({0}) = {1}")
    @MethodSource("valuesAndResults")
    void calcPascal(int n, List<Integer> expected)
    {
        final Consumer<List<Integer>> NOOP = whatever -> { };
        List<Integer> result = PascalTriangle.calcPascal2(n, NOOP);
        assertEquals(expected, result);
    }
    private static Stream<Arguments> valuesAndResults()
    {
        return Stream.of(Arguments.of(1, List.of(1)),
                Arguments.of(2, List.of(1,1)),
                Arguments.of(3, List.of(1,2,1)),
                Arguments.of(4, List.of(1,3,3,1)),
                Arguments.of(5, List.of(1,4,6,4,1)));
    }
}

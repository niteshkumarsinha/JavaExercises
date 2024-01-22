package maths;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPrimeFactorization {
    @ParameterizedTest(name = "calcPrimeFactors({0}) = {1}")
    @MethodSource("valueAndPrimeFactors")
    void calcPrimeFactors(int value, List<Integer> expected)
    {
        var result = new PrimeFactorization().calcPrimeFactors(value);
        assertEquals(expected, result);
    }
    @ParameterizedTest(name = "calcPrimeFactorsOptimized({0}) = {1}")
    @MethodSource("valueAndPrimeFactors")
    void calcPrimeFactorsOpt(final int value, final List<Integer> expected)
    {
        var result = new PrimeFactorization().calcPrimeFactors(value);
        assertEquals(expected, result);
    }
    private static Stream<Arguments> valueAndPrimeFactors()
    {
        return Stream.of(Arguments.of(8, List.of(2, 2, 2)),
                Arguments.of(14, List.of(2, 7)),
                Arguments.of(42, List.of(2, 3, 7)),
                Arguments.of(1155, List.of(3, 5, 7, 11)),
                Arguments.of(2222, List.of(2, 11, 101)));
    }
}

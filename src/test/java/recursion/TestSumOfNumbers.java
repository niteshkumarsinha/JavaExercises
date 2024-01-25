package recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSumOfNumbers {

    @ParameterizedTest
    @CsvSource({"1,1", "2,3", "3,6", "4,10", "5,15"})
    void testSumOfNumbers(int n, int expected){
        var res = SumOfNumbers.sum(n);
        assert res == expected;
    }

    @ParameterizedTest(name="sum({0}) = {1}")
    @MethodSource("valuesAndResult")
    void sum(int[] values, int expected)
    {
        int result = new SumOfNumbers().sumOfArrayRec(values);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> valuesAndResult()
    {
        return Stream.of(Arguments.of(new int[] { 1 }, 1),
                Arguments.of(new int[] { 1, 2, 3 }, 6),
                Arguments.of(new int[] { 1, 2, 3, -7 }, -1));
    }

}

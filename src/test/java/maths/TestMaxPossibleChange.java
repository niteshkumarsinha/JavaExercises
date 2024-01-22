package maths;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class TestMaxPossibleChange {

    @ParameterizedTest
    @MethodSource("inputsAndMaxChange")
    void testMaxPossibleChange(List<Integer> values, int expected){
        int result = MaxChangeCalculator.getMaxPossibleValue(values);
        assert expected == result;
    }

    private static Stream<Arguments> inputsAndMaxChange(){
        return Stream.of(
                Arguments.of(List.of(1), 1),
                Arguments.of(List.of(1,1), 2),
                Arguments.of(List.of(1, 5), 1),
                Arguments.of(List.of(1, 2, 4), 7),
                Arguments.of(List.of(1, 2, 3, 7), 13),
                Arguments.of(List.of(1, 2, 3, 8), 6),
                Arguments.of(List.of(1, 1, 1, 1, 5, 10, 20, 50), 39)
        );
    }
}

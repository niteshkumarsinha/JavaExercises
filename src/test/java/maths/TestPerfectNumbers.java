package maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;


public class TestPerfectNumbers {
    PerfectNumbers perfectNumbers;

    @BeforeEach
    void setUp(){
        perfectNumbers = new PerfectNumbers();
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void testPerfectNumbers(int num, List<Integer> actual){
        var expected = perfectNumbers.calcPerfectNumbers(num);
        assertIterableEquals(actual, expected);
    }

    public static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.of(1000, List.of(6, 28, 496)),
                Arguments.of(10000, List.of(6, 28, 496, 8128))
        );
    }


}

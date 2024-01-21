package maths;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArmstrongNumbers {

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void testArmstrongNumbers(List<Integer> expected){
        List<Integer> result = ArmstrongNumbers.calcArmstrongNumbers();
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void testArmstrongNumbers2(List<Integer> expected){
        List<Integer> result = ArmstrongNumbers.calcArmstrongNumbers2();
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void testArmstrongNumbers3(List<Integer> expected){
        List<Integer> result = ArmstrongNumbers.calcArmstrongNumbers3();
        assertEquals(result, expected);
    }

    static Stream<Arguments> argumentsProvider(){
        return Stream.of(
                Arguments.of(List.of(153, 370, 371, 407))
        );
    }

}

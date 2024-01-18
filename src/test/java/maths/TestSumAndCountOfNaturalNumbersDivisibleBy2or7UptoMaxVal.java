package maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSumAndCountOfNaturalNumbersDivisibleBy2or7UptoMaxVal {
    CalcSumAndCountOfNaturalNumbersDivisibleBy2or7 calcSumAndCountOfNaturalNumbersDivisibleBy2or7;

    @BeforeEach
    void setUp(){
        calcSumAndCountOfNaturalNumbersDivisibleBy2or7 = new CalcSumAndCountOfNaturalNumbersDivisibleBy2or7();
    }

    @ParameterizedTest
    @CsvSource({"3,1", "8,4", "15,8"})
    void testCalcCountOfNaturalNumbersDivisibleBy2or7(int maxNum, int count){
        Map<CalcSumAndCountOfNaturalNumbersDivisibleBy2or7.ReturnCode, Integer> result = calcSumAndCountOfNaturalNumbersDivisibleBy2or7.calcSumAndCountAllNumbersDivBy_2_Or_7(maxNum);
        assertEquals(result.get(CalcSumAndCountOfNaturalNumbersDivisibleBy2or7.ReturnCode.COUNT), count);

    }

    @ParameterizedTest
    @CsvSource({"3,2", "8,19", "15,63"})
    void testCalcSumOfNaturalNumbersDivisibleBy2or7(int maxNum, int sum){
        Map<CalcSumAndCountOfNaturalNumbersDivisibleBy2or7.ReturnCode, Integer> result = calcSumAndCountOfNaturalNumbersDivisibleBy2or7.calcSumAndCountAllNumbersDivBy_2_Or_7(maxNum);
        assertEquals(result.get(CalcSumAndCountOfNaturalNumbersDivisibleBy2or7.ReturnCode.SUM), sum);
    }


    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void testCalcSumAndCountOfNaturalNumbersDivisibleBy2or7(int maxNum,
                                                            Map<CalcSumAndCountOfNaturalNumbersDivisibleBy2or7.ReturnCode, Integer> expected){
        var result = calcSumAndCountOfNaturalNumbersDivisibleBy2or7.calcSumAndCountAllNumbersDivBy_2_Or_7(maxNum);
        assertEquals(expected, result);
    }

    public static Stream<Arguments> argumentsProvider(){
        return Stream.of(
                Arguments.of(
                        3, Map.of(CalcSumAndCountOfNaturalNumbersDivisibleBy2or7.ReturnCode.SUM, 2,
                                CalcSumAndCountOfNaturalNumbersDivisibleBy2or7.ReturnCode.COUNT,1)),
                Arguments.of(
                        8, Map.of(CalcSumAndCountOfNaturalNumbersDivisibleBy2or7.ReturnCode.SUM, 19,
                                CalcSumAndCountOfNaturalNumbersDivisibleBy2or7.ReturnCode.COUNT,4)),
                Arguments.of(
                        15, Map.of(CalcSumAndCountOfNaturalNumbersDivisibleBy2or7.ReturnCode.SUM, 63,
                                CalcSumAndCountOfNaturalNumbersDivisibleBy2or7.ReturnCode.COUNT,8))
                );
    }
}

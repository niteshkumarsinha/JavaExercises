package recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExponential {

    @ParameterizedTest(name = "isPowerOf({0}} = {1}")
    @CsvSource({"2, true", "3, false", "4, true", "10, false", "16, true"})
    void isPowerOf2(int number, boolean expected){
        boolean result = new Exponential().isPowerOf2(number);
        assert result == expected;
    }

    @ParameterizedTest(name = "powerOf({0} => {1})")
    @CsvSource({ "2, 2, 4", "4, 2, 16", "16, 2, 256", "4, 4, 256", "2, 8, 256" })
    void powerOf(int number, int exponent, long expected){
        long result = Exponential.powerOf(number, exponent);
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "powerOfIterative({0} => {1})")
    @CsvSource({ "2, 2, 4", "4, 2, 16", "16, 2, 256", "4, 4, 256", "2, 8, 256" })
    void powerOfIter(int number, int exponent, long expected){
        long result = new Exponential().powerOfIterative(number, exponent);
        assertEquals(expected, result);
    }

}

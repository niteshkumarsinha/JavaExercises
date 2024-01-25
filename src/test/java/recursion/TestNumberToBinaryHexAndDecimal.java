package recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumberToBinaryHexAndDecimal {
    @ParameterizedTest(name = "toBinary({0}) => {1}")
    @CsvSource({ "5, 101", "7, 111", "22, 10110", "42, 101010", "256, 100000000" })
    void toBinary(int value, String expected){
        String result = new NumberToBinaryHexAndOctal().toBinary(value);
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "toOctal({0}) => {1}")
    @CsvSource({ "42, 52", "7, 7", "8, 10" })
    void toOctal(int value, String expected){
        String result = new NumberToBinaryHexAndOctal().toOctal(value);
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "toHex({0}) => {1}")
    @CsvSource({ "77, 4D", "15, F", "16, 10" })
    void toHex(int value, String expected){
        String result = new NumberToBinaryHexAndOctal().toHex(value);
        assertEquals(expected, result);
    }
}

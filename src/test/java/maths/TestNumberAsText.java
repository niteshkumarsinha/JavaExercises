package maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumberAsText {

    @ParameterizedTest
    @CsvSource({"7, SEVEN", "42, FOUR TWO", "7271, SEVEN TWO SEVEN ONE",
            "24680, TWO FOUR SIX EIGHT ZERO",
            "13579, ONE THREE FIVE SEVEN NINE"})
    void testNumberAsText(int num, String expected){
        assertEquals(NumberAsText.numberAsText(num), expected);
    }

}

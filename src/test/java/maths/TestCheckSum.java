package maths;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestCheckSum {

    @ParameterizedTest(name="checksum({0}) = {1}")
    @CsvSource({ "11111, 5", "22222, 0", "111111, 1",
            "12345678, 4", "87654321, 0" })
    void testCalcChecksum(String input, int expected){
        int result = CheckSum.calcChecksum(input);
        assert expected == result;
    }
}

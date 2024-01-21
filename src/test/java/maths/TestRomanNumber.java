package maths;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestRomanNumber {

    @ParameterizedTest
    @CsvSource({ "1, I", "2, II", "3, III", "4, IV", "5, V", "7, VII", "9, IX",
            "17, XVII", "40, XL", "90, XC", "400, CD", "444, CDXLIV", "500, D",
            "900, CM", "1000, M", "1666, MDCLXVI", "1971, MCMLXXI",
            "2018, MMXVIII", "2019, MMXIX", "2020, MMXX", "3000, MMM"})
    void testFromRomanNumber(int expected, String roman){
        int result = RomanNumber.fromRomanNumber(roman);
        assert result == expected;
    }
}
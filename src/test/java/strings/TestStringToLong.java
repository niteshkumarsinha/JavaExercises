package strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestStringToLong {
    @ParameterizedTest(name = "strToLongV2(\"{0}\") => {1}")
    @CsvSource({ "+123, 123", "-123, -123", "123, 123", "7271, 7271" })
    void testStrToLong(String number, long expected)
    {
        long result = StringToLong.strToLongV1(number);
        assertEquals(expected, result);
    }

    @ParameterizedTest(name = "strToLongV2(\"{0}\") => {1}")
    @CsvSource({ "+123, 123", "-123, -123", "123, 123", "7271, 7271",
            "+077, 63", "-077, -63", "077, 63",
            "+0123, 83", "-0123, -83", "0123, 83" })
    void testStrToLongV2(String number, long expected)
    {
        long result = StringToLong.strToLongV1(number);
        assertEquals(expected, result);
    }

    @Test
    void testStrToLongV2Error()
    {
        assertThrows(IllegalArgumentException.class,
                () -> StringToLong.strToLongV1("ABC"));
    }
}

package strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompareVersions {
    @ParameterizedTest(name = "''{0}'' {3} ''{1}''")
    @CsvSource({ "1.11.17, 2.3.5, -1, <", "2.3.5, 2.4, -1, <",
            "2.1, 2.1.3, -1, <", "3.1, 2.4, 1, >",
            "3.3, 3.2.9, 1, >", "7.2.71, 7.2.71, 0, =" })
    void compareVersions(String v1, String v2, int expected, String hint)
    {
        int result = CompareVersions.compareVersions(v1, v2);
        assertEquals(expected, result);
    }
}

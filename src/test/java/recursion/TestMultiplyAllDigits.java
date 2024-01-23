package recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestMultiplyAllDigits {
    @ParameterizedTest
    @CsvSource({"1,1", "12,2", "123,6", "1234,24", "12345,120"})
    void testMultiplyAllDigits(int num, int expected){
        var res = MultiplyAllDigits.multiplyAllDigits(num);
        assert res == expected;
    }
}

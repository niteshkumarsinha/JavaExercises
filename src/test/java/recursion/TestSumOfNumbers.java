package recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestSumOfNumbers {

    @ParameterizedTest
    @CsvSource({"1,1", "2,3", "3,6", "4,10", "5,15"})
    void testSumOfNumbers(int n, int expected){
        var res = SumOfNumbers.sum(n);
        assert res == expected;
    }
}

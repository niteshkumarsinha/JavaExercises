package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class TestFibonacci {

    @Test
    void testThrowsException(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> Fibonacci.fibonacci(-1));

        String expectedMessage = exception.getMessage();
        String actualMessage = "number must be >= 1";
        assert expectedMessage.equals(actualMessage);
    }

    @ParameterizedTest
    @CsvSource({"1,1", "1,2", "2,3", "3,4", "5,5", "8,6", "13,7", "21,8"})
    void testFibonacci(int expected, int seq){
        var res = Fibonacci.fibonacci(seq);
        assert res == expected;
    }
}

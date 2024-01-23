package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestFactorial {

    @ParameterizedTest
    @CsvSource({"0,1", "1,1", "2,2", "3,6", "4,24", "5,120", "6,720"})
    void testFactorial(int num, int expected){
        int actual = Factorial.factorial(num);
        assert actual == expected;
        
    }

    @Test
    void testFactorial(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Factorial.factorial(-1);
        });
        String expectedException = exception.getMessage();
        String actualMessage = "n must be >= 0";
        assert expectedException.equals(actualMessage);
    }
    
    
}

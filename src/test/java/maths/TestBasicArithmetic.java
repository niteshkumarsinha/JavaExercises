package maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestBasicArithmetic {

    BasicArithmetic basicArithmetic;

    @BeforeEach
    void setUp(){
        basicArithmetic = new BasicArithmetic();
    }

    @ParameterizedTest
    @CsvSource({"6,7,0", "3,4,6", "5,5,5"})
    void testBasicArithmetic(int num1, int num2, int expected){
        assertEquals(basicArithmetic.calc(num1, num2), expected);
    }
}

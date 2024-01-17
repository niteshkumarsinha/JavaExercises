package maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.stream.IntStream;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPrimeNumbers {
    PrimeNumber primeNumber;
    IntStream numbers = IntStream.range(1, 100);

    @BeforeEach
    void setUp(){
       primeNumber = new PrimeNumber();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15})
    void testPrimeNumbers(int num){
        if(num == 4 || num == 6 || num == 8 || num == 9 || num == 10 || num == 12 || num == 14 || num == 15) {
            assertFalse(primeNumber.isPrime(num));
        }else{
            assertTrue(primeNumber.isPrime(num));
        }
    }
}

package maths;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

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

    @ParameterizedTest(name = "calcPrimes({0}) = {1}")
    @MethodSource("argumentsProvider")
    void testPrimeNumbersUptoRange(int range, List<Integer> expected){
        List<Integer> result = primeNumber.calcPrimesUpto(range);
        assertEquals(result, expected);
    }

    static Stream<Arguments> argumentsProvider(){
        return Stream.of(
                Arguments.of(2, List.of(2)),
                Arguments.of(3, List.of(2, 3)),
                Arguments.of(10, List.of(2, 3, 5, 7)),
                Arguments.of(15, List.of(2, 3, 5, 7, 11, 13)),
                Arguments.of(25, List.of(2, 3, 5, 7, 11, 13,
                        17, 19, 23)),
                Arguments.of(50, List.of(2, 3, 5, 7, 11, 13,
                        17, 19, 23, 29, 31,
                        37, 41, 43, 47))
        );
    }
}

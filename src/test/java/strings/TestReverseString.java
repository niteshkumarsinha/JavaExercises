package strings;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReverseString {

    ReverseString reverseString;

    @BeforeEach
    void setUp(){
        reverseString = new ReverseString();
    }
    @Test
    void testReverseString(){
        assertEquals(reverseString.reverseStringShort("nitesh"), "hsetin");
    }

    @ParameterizedTest(name = "reverse({0}) => {1}")
    @CsvSource({ "ABCD, DCBA", "OTTO, OTTO", "PETER, RETEP" })
    void testReverse(final String input, final String expectedOutput)
    {
        final String result = new ReverseString().reverseRec(input);
        assertEquals(expectedOutput, result);
    }

    @ParameterizedTest(name = "reverse({0}) => {1}")
    @CsvSource({ "ABCD, DCBA", "OTTO, OTTO", "PETER, RETEP" })
    void testReverseIter(final String input, final String expectedOutput)
    {
        final String result = new ReverseString().reverseInPlace(input);
        assertEquals(expectedOutput, result);
    }
}

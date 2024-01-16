package strings;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}

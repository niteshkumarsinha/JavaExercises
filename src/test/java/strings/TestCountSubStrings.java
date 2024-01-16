package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCountSubStrings {

    CountSubStrings countSubStrings;

    @BeforeEach
    void setUp(){
        countSubStrings = new CountSubStrings();
    }

    @Test
    void testCountSubStrings(){
        assertEquals(countSubStrings.countSubStrings("nitesh", "es"), 1);
    }
}

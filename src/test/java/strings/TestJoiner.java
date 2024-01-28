package strings;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJoiner {
    @Test
    public void testJoinLowLevel()
    {
        var result = Joiner.join(List.of("hello", "world", "message")," +++ ");
        assertEquals("hello +++ world +++ message", result);
    }
    @Test
    public void testJoinStringsWithStream()
    {
        var result = Joiner.joinStrings(List.of("Micha", "Zurich")," likes ");
        assertEquals("Micha likes Zurich", result);
    }

    @Test
    public void testJoinStringsIter()
    {
        var result = Joiner.joinIter(List.of("Micha", "Zurich")," likes ");
        assertEquals("Micha likes Zurich", result);
    }
}

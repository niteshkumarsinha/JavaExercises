package maths;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import maths.FindProperDivisors;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRelatedNumbers {
    @ParameterizedTest(name = "calcFriends({0}) = {1}")
    @MethodSource("upperBoundAndExpectedFriends")
    void calcFriends(int maxValue, Map<Integer, Integer> expected)
    {
        Map<Integer, Integer> result = new RelatedNumbers().calcFriendsUpto(maxValue);
        assertEquals(expected, result);
    }
    private static Stream<Arguments> upperBoundAndExpectedFriends()
    {
        return Stream.of(Arguments.of(250, Map.of(220, 284)),
                Arguments.of(300, Map.of(220, 284,
                        284, 220)),
                Arguments.of(2_000, Map.of(220, 284,
                        284, 220,
                        1184, 1210,
                        1210,1184)));
    }
}

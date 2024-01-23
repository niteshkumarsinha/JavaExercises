package recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestPalindrome {

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void testIsPalindrome(int[] array, boolean expected){
        boolean res = Palindrome.isPalindrome(array, 0, array.length - 1);
        assert res == expected;
    }

    static Stream<Arguments> argumentsProvider(){
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2, 1}, true),
                Arguments.of(new int[]{1, 2, 2, 2}, false),
                Arguments.of(new int[]{1, 2, 3, 2, 1}, true),
                Arguments.of(new int[]{1, 2, 3, 3, 2, 1}, true),
                Arguments.of(new int[]{1, 2, 3, 3, 2, 2}, false)
        );
    }
}

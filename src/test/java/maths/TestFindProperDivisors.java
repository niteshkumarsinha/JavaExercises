package maths;

import maths.FindProperDivisors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestFindProperDivisors {

    FindProperDivisors findProperDivisors;

    @BeforeEach
    void setUp(){
        findProperDivisors = new FindProperDivisors();
    }

    @ParameterizedTest()
    @ValueSource(ints = {6, 24, 7})
    void testFindProperDivisors(int val){
        List<Integer> vals = new ArrayList<>();
        if (val == 6){
            vals = List.of(1, 2, 3);
        }else if(val == 24){
            vals = List.of(1, 2, 3, 4, 6, 8, 12);
        }else{
            vals = List.of(1);
        }
        Assertions.assertIterableEquals(findProperDivisors.findProperDivisors(val), vals);
    }
}

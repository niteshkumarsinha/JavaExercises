package recursion;

public class CalcLengthOfString {
    static int calcLengthParameterValues(final String value, final int count){
        if(value.length() == 0) return count;
        return calcLengthParameterValues(value.substring(1), count + 1);
    }
}

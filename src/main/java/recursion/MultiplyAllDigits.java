package recursion;

public class MultiplyAllDigits {
    public static int multiplyAllDigits(final int value){
        final int remainder = value / 10;
        final int digitValue = value % 10;

        if(remainder > 0){
            final int result = multiplyAllDigits(remainder);
            return digitValue * result;
        }else {
            return value;
        }
    }

    public static void main(String[] args) {
        int res = MultiplyAllDigits.multiplyAllDigits(1234);
        System.out.println(res);
    }

}

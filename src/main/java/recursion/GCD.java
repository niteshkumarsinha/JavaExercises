package recursion;

public class GCD {
    int gcdRec(final int num1, final int num2){
        if(num2 < 1)
            return num1;
        return gcdRec(num2, num1 % num2);
    }

    int gcd(int num1, int num2){
        if(num2 < 1){
            return num1;
        }
        int remainder = num1;
        while (remainder != 0){
            remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        int res = gcd.gcdRec(10, 4);
        res = gcd.gcd(10, 4);
        res = gcd.gcd(24, 9);
        System.out.println(res);
    }


}

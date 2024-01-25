package recursion;

public class LCM {
    GCD gcd;

    public LCM() {
        gcd = new GCD();
    }

    int lcm(int a, int b){
        return a * b / gcd.gcdRec(a, b);
    }

    public static void main(String[] args) {
        LCM lcm = new LCM();
        int res = lcm.lcm(2, 7);
        System.out.println(res);
        res = lcm.lcm(7, 14);
        System.out.println(res);
        res = lcm.lcm(42, 14);
        System.out.println(res);
    }

}

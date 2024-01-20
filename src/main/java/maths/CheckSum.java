package maths;

public class CheckSum {

    static int calcChecksum(final String input) {
        int checksum = 0;
        int remainder = Integer.parseInt(input);
        int length = input.length();
        while (remainder > 0) {
            checksum += (remainder % 10) * length--;
            remainder /= 10;
        }
        return checksum % 10;
    }

    public static void main(String[] args) {
        int result = calcChecksum("11111");
    }
}

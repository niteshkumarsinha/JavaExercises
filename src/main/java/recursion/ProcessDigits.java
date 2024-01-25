package recursion;

public class ProcessDigits {
    int countDigits(final int num){
        int remainder = num;
        int count = 0;
        while (remainder > 0){
            remainder /= 10;
            count++;
        }
        return count;
    }

    int countDigitsRec(final int num, final int count){
        if(num < 1){
            return count;
        }
        return countDigitsRec(num / 10, count + 1);
    }

    int calcSumOfDigits(final int num, final int sum){
        if(num < 1){
            return sum;
        }
        return calcSumOfDigits(num / 10, sum + num % 10);
    }

    public static void main(String[] args) {
        ProcessDigits processDigits = new ProcessDigits();
        System.out.println(processDigits.countDigits(1234567890));
        System.out.println(processDigits.countDigitsRec(1234567890, 0));
        System.out.println(processDigits.calcSumOfDigits(1234567890, 0));
    }
}

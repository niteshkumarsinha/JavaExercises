package maths;

import java.util.*;
import java.util.stream.Collectors;

public class RomanNumber {
    static Map<Character, Integer> romanToInt = Map.of(
            'I',1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    static Map<Integer, Character> intToRoman = Map.of(
            1, 'I',
            5, 'V',
            10, 'X',
            50, 'L',
            100, 'C',
            500, 'D',
            1000, 'M'
    );

    static Map<Integer, String> intToRomanDigitMap = new TreeMap<>()
    {{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "CM");
        put(1000, "M");
    }};

    static int fromRomanNumber(final String romanNumber){
        char[] numerals = romanNumber.toCharArray();
        int number = 0;
        int length = numerals.length;
        for(int pos = length - 1; pos >= 0; pos--){
            int val = romanToInt.get(numerals[pos]);
            if(pos == length - 1){
                number += val;
            }else if(pos < length - 1 && romanToInt.get(numerals[pos + 1]) <= val){
                number += val;
            }else{
                number -= romanToInt.get(numerals[pos]);
            }
        }
        return number;
    }

    static String toRomanNumber(int number){

        String romanVal = "";
        Set<Integer> vals = intToRomanDigitMap.keySet();
        List<Integer> sortedVals = vals.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }).collect(Collectors.toList());

        int index = 0;
        int remainder = number;

        while(index < sortedVals.size() && remainder > 0){
            int currentBaseVal = sortedVals.get(index);
            int numOfNumeral = remainder / currentBaseVal;
            if(numOfNumeral > 0){
                for (int i = 0; i < numOfNumeral; i++) {
                    romanVal += intToRomanDigitMap.get(currentBaseVal);
                }
            }
            remainder %= currentBaseVal;
            while (index < sortedVals.size() && sortedVals.get(index) > remainder){
                index++;
            }
        }

        return updateToRoman(romanVal);
    }

    static String updateToRoman(String romanString){
        char[] numerals = romanString.toCharArray();
        char prevChar = numerals[0];
        String result = "";
        int startPos = 0;
        int count = 0;
        while (startPos < numerals.length) {
            count = 0;
            char currentChar = numerals[startPos];
            while (startPos < numerals.length && numerals[startPos] == prevChar) {
                count++;
                startPos++;
            }

            if(count == 9 || count == 4){
                int val = romanToInt.get(currentChar) * count;
                String numeral = intToRomanDigitMap.get(val);
                result += numeral;
            }else if(count < 9 && count > 4){
                int numOfNumeral = count / 4;
                int remainder = count % 4;
                for(int i = 0; i < numOfNumeral; i++){
                    int val = romanToInt.get(currentChar) * count;
                    String numeral = intToRomanDigitMap.get(val);
                    result += numeral;
                }
                for (int i = 0; i < remainder; i++) {
                    int val = romanToInt.get(currentChar);
                    result += intToRomanDigitMap.get(val);
                }
            } else if(count > 1){
                for (int i = 0; i < count; i++) {
                    result += currentChar;
                }
            } else {
                result += currentChar;
            }
            if (startPos == numerals.length) break;
            prevChar = numerals[startPos];
        }
        return result;
    }

    public static void main(String[] args) {
        String roman = "MMXX";
        int number = RomanNumber.fromRomanNumber(roman);
        System.out.println(number);

        String romanVal = RomanNumber.toRomanNumber(number);
        System.out.println(romanVal);

    }
}

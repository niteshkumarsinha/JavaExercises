package strings;

import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    static String toMorseCode(String string){
        Map<Character, String> morseMapping = getMorseCode();
        char[] chars = string.toUpperCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char ch: chars){
            sb.append(morseMapping.get(ch) + " ");
        }
        return sb.toString().trim();
    }

    private static Map<Character, String> getMorseCode() {
        Map<Character, String> morseMapping = new HashMap<>();
        morseMapping.put('A', ".-");
        morseMapping.put('B', "-...");
        morseMapping.put('C', "-.-.");
        morseMapping.put('D', "-..");
        morseMapping.put('E', ".");
        morseMapping.put('F', "..-.");
        morseMapping.put('G', "--.");
        morseMapping.put('H', "....");
        morseMapping.put('I', "..");
        morseMapping.put('J', ".---");
        morseMapping.put('K', "-.-");
        morseMapping.put('L', ".-..");
        morseMapping.put('M', "--");
        morseMapping.put('N', "-.");
        morseMapping.put('O', "---");
        morseMapping.put('P', ".--.");
        morseMapping.put('Q', "--.-");
        morseMapping.put('R', "-.-");
        morseMapping.put('S', "...");
        morseMapping.put('T', "-");
        morseMapping.put('U', "..-");
        morseMapping.put('V', "...-");
        morseMapping.put('W', ".--");
        morseMapping.put('X', "-..-");
        morseMapping.put('Y', "-.--");
        morseMapping.put('Z', "--..");
        morseMapping.put('1', ".----");
        morseMapping.put('2', "..---");
        morseMapping.put('3', "...--");
        morseMapping.put('4', "....-");
        morseMapping.put('5', ".....");
        morseMapping.put('6', "-....");
        morseMapping.put('7', "--...");
        morseMapping.put('8', "---..");
        morseMapping.put('9', "----.");
        morseMapping.put('0', "-----");
        return morseMapping;
    }

    public static void main(String[] args) {
        System.out.println(toMorseCode("SOS"));
    }
}

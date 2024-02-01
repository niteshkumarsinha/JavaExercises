package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CheckBraces {
    enum BraceType {
        OPENING,
        CLOSING
    }

    static boolean checkBraces(String string){
        boolean checkWellFormed;
        Map<Character, Enum<BraceType>> braceType = new HashMap<>();
        braceType.put('(', BraceType.OPENING);
        braceType.put(')', BraceType.CLOSING);
        Stack<Character> stack = new Stack<>();
        char[] chars = string.toCharArray();
        int idx = 0;
        while(idx < chars.length){
            char currentChar = chars[idx];
            if(braceType.get(currentChar) == BraceType.OPENING){
                stack.push(currentChar);
                idx++;
            }else if(braceType.get(currentChar) == BraceType.CLOSING){
                if(!stack.isEmpty())
                    stack.pop();
                else{
                    stack.add(currentChar);
                    break;
                }
                idx++;
            }else{
                idx++;
            }
        }
        checkWellFormed = stack.isEmpty();
        return checkWellFormed;
    }

    public static void main(String[] args) {
        CheckBraces checkBraces = new CheckBraces();
        System.out.println(checkBraces.checkBraces("(())"));
        System.out.println(checkBraces.checkBraces("()()"));
        System.out.println(checkBraces.checkBraces("((()"));
    }
}

package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PascalTriangle {
    static int calcPascal(final int row, final int col){
        if(row == 1 && col == 1) return 1;
        if(col == 1 || col == row) return 1;
        return calcPascal(row - 1, col) + calcPascal(row - 1, col - 1);
    }

    static void printPascal(int num){
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                if(col == 1)
                    System.out.print("[");

                System.out.print(calcPascal(row, col));

                if(col < row)
                    System.out.print(", ");
                if(col == row)
                    System.out.print("]");
            }
            System.out.println();
        }
    }

    static List<Integer> calcPascal2(final int n, final Consumer<List<Integer>> action) {
        if (n == 1) {
            action.accept(List.of(1));
            return List.of(1);
        }
        else {
            final List<Integer> previousLineValues = calcPascal2(n - 1, action);
            final List<Integer> newLine = calcLine(previousLineValues);
            action.accept(newLine);
            return newLine;
        }
    }

    static List<Integer> calcLine(final List<Integer> previousLine) {
        final List<Integer> currentLine = new ArrayList<>();
        currentLine.add(1);
        for (int i = 0; i < previousLine.size() - 1; i++) {
            final int newValue = previousLine.get(i) + previousLine.get(i + 1);
            currentLine.add(newValue);
        }
        currentLine.add(1);
        return currentLine;
    }



    public static void main(String[] args) {
        printPascal(5);
    }
}

package maths;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Formulas {

    static ArrayList<int[]> compute_a2_b2_c2(){
        ArrayList<int[]> compute_combinations = new ArrayList<>();
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                for (int c = 1; c < 100; c++) {
                    if(a * a + b * b == c * c){
                        compute_combinations.add(new int[]{a, b, c});
                    }
                }
            }
        }
        return compute_combinations;
    }

    static ArrayList<int[]> compute_a2_b2_c2_with_sqrt(){
        ArrayList<int[]> withSqrt = new ArrayList<>();
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                final int c = (int) Math.sqrt(a * a + b * b);
                if(c < 100 && a * a + b * b == c * c){
                    withSqrt.add(new int[]{a,b,c});
                }
            }
        }
        return withSqrt;
    }

    static ArrayList<int[]> compute_a2_b2_c2_d2(){
        ArrayList<int[]> compute_combinations = new ArrayList<>();
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                for (int c = 1; c < 100; c++) {
                    final int value = a * a + b * b - c * c;
                    if(value > 0){
                        final int d = (int) Math.sqrt(value);
                        if(d < 100 && a * a + b * b == c * c + d * d){
                            compute_combinations.add(new int[]{a, b, c, d});
                        }
                    }
                }
            }
        }
        return compute_combinations;
    }


    public static void main(String[] args) {
        compute_a2_b2_c2().forEach(elem ->
                System.out.println(String.format("%d^2 + %d^2 = %d^2", elem[0], elem[1], elem[2])));
        System.out.println();
        System.out.println();
        compute_a2_b2_c2_with_sqrt().forEach(elem ->
                System.out.println(String.format("%d^2 + %d^2 = %d^2", elem[0], elem[1], elem[2])));
        compute_a2_b2_c2_d2().forEach(elem ->
                System.out.println(String.format("%d^2 + %d^2 = %d^2 + %d^2", elem[0], elem[1], elem[2], elem[3])));
    }
}

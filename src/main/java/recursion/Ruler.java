package recursion;

public class Ruler {
    static void drawRuler(final int majorTickCount, final int maxLength){
        drawLine(maxLength, "0");
        for (int i = 1; i <= majorTickCount; i++) {
            drawInterval(maxLength - 1);
            drawLine(maxLength, "" + i);
        }
    }

    static void drawInterval(final int centerLength){
        if(centerLength > 0){
            drawInterval(centerLength - 1);
            drawLine(centerLength, "");
            drawInterval(centerLength - 1);
        }
    }

    static void drawLine(final int count, final String label){
        System.out.println("-".repeat(count) + " " + label);
    }

    public static void main(String[] args) {
        drawRuler(3,4);
    }
}

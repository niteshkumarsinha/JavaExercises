package strings;

public class PrintTower {
    static void printTower(int height){
        drawTop(height);
        drawMid(height);
        drawBottom(height);
    }

    static private void drawBottom(int height) {
        int length = 2 * (height + 1) + 1;
        repeatCharSeq("-", length);
        System.out.println("");
    }

    static private void drawMid(int height) {
        for (int i = height; i > 0; i--) {
            repeatCharSeq(" ", i);
            repeatCharSeq("#", height + 1 - i);
            System.out.print("|");
            repeatCharSeq("#", height + 1 - i);
            repeatCharSeq(" ", i);
            System.out.println();
        }
    }

    static private void drawTop(int height) {
        repeatCharSeq(" ", height + 1);
        System.out.println("|");
    }

    static private void repeatCharSeq(String string, int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(string);
        }
    }

    public static void main(String[] args) {
        printTower(3);
        printTower(4);
    }

}

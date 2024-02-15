package arrays;


public class Swap {

    public static <T> void swap(final T[] array, final int first, final int second){
        T value1 = array[first];
        T value2 = array[second];
        array[first] = value2;
        array[second] = value1;
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        swap(array1, 1, 4);
        System.out.println(Arrays.toString(array1));
    }
}

package arrays;

public class Arrays {
    static <T> String toString(T[] array){
        String stringRepr = "\"[";
        for (int i = 0; i < array.length; i++) {
            stringRepr += array[i];
            if(i < array.length - 1) stringRepr += ", ";
        }
        stringRepr += "]\"";
        return stringRepr;
    }

    static <T> void printArray(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static <T> int find(T[] array, T searchFor){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(searchFor)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] array = {"Tim", "Mike"};
        System.out.println(toString(array));
        printArray(array);
        Integer[] array1 = {1, 2, 3, 4, 5};
        System.out.println(toString(array1));
        printArray(array1);
        System.out.println(find(array1, 5));
        System.out.println(find(array1, 10));
    }
}

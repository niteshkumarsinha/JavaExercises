package arrays;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
    static int[] removeDuplicates(final int[] sortedNumbers){
        final Set<Integer> uniqueValues = collectValues(sortedNumbers);
        return convertToArray(uniqueValues);
    }

    private static int[] convertToArray(Set<Integer> uniqueValues) {
        return uniqueValues.stream().mapToInt(n -> n).toArray();
    }

    private static Set<Integer> collectValues(int[] sortedNumbers) {
        final Set<Integer> uniqueValues = new TreeSet<>();
        for (int i = 0; i < sortedNumbers.length; i++) {
            uniqueValues.add(sortedNumbers[i]);
        }
        return uniqueValues;
    }

    static Set<Integer> collectValuesMaintainInsertionOrder(int[] numbers){
        final Set<Integer> uniqueValues = new LinkedHashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            uniqueValues.add(numbers[i]);
        }
        return uniqueValues;
    }

    public static Integer[] removeDuplicatesInPlace(Integer[] sortedArray){
        int prevVal = sortedArray[0];
        int readPos = 1;
        int writePos = 1;
        while (readPos < sortedArray.length){
            int currentVal = sortedArray[readPos];
            if(prevVal != currentVal){
                sortedArray[writePos++] = currentVal;
                prevVal = currentVal;
            }
            readPos++;
        }
        while (writePos < sortedArray.length){
            sortedArray[writePos++] = -1;
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        Integer[] array = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
        System.out.println(Arrays.toString(removeDuplicatesInPlace(array)));
    }
}

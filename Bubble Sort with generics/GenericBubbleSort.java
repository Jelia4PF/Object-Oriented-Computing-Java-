import java.util.Arrays;

public class GenericBubbleSort {

    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        boolean needNextPass = true;
        
        for (int k = 1; k < array.length && needNextPass; k++) {
            
            needNextPass = false;
            for (int i = 0; i < array.length - k; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    // Swap array[i] with array[i + 1]
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {2, 3, 1, 5, 4};
        bubbleSort(intArray);
        System.out.println("Sorted Integer Array: " + Arrays.toString(intArray));

        String[] stringArray = {"banana", "apple", "mango", "lemon", "orange"};
        bubbleSort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}


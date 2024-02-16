import java.io.*;
import java.util.*;

public class MergeSortAppYes {

    // Create a random array of Integers 
    public static Integer[] createRandomArray(int arrayLength) {
        Integer[] array = new Integer[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(101); // Random number between 0 and 100
        }
        return array;
    }

    // Write array to file 
    public static <T> void writeArrayToFile(T[] array, String filename) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (T value : array) {
                bw.write(value + "\n");
            }
        }
    }

    // Generic merge sort method
    public static <T extends Comparable<T>> void mergeSort(T[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            T[] left = Arrays.copyOfRange(array, 0, mid);
            T[] right = Arrays.copyOfRange(array, mid, array.length);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
    }

    // Generic merge method
    private static <T extends Comparable<T>> void merge(T[] result, T[] left, T[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) < 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    // Main method to demonstrate usage
    public static void main(String[] args) throws IOException {
        
        Integer[] myArray = createRandomArray(10);
        String filename = "myArray.txt";

        writeArrayToFile(myArray, filename);
        
        Integer[] arrayFromFile = readFileToArray(filename);

        mergeSort(arrayFromFile);

        System.out.println("Sorted Array: " + Arrays.toString(arrayFromFile));
        writeArrayToFile(arrayFromFile, "sorted" + filename);
    }

    public static Integer[] readFileToArray(String filename) throws IOException {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
        }
        return list.toArray(new Integer[0]);
    }
}

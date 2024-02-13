import java.io.*;
import java.util.*;

public class MergeSortApp {

    
    public static int[] createRandomArray(int arrayLength) {
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }

    
    public static void writeArrayToFile(int[] array, String filename) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (int value : array) {
                bw.write(value + "\n");
            }
        }
    }

    // Read file to array
    public static int[] readFileToArray(String filename) throws IOException {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    // Merge Sort
    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
    }

    // Merge two halves
    private static void merge(int[] result, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
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

    // Main method
    public static void main(String[] args) throws IOException {
        // Example usage
        int[] myArray = createRandomArray(10);
        String filename = "myArray.txt";

        writeArrayToFile(myArray, filename);
        int[] arrayFromFile = readFileToArray(filename);

        mergeSort(arrayFromFile);

        System.out.println("Sorted Array: " + Arrays.toString(arrayFromFile));
        writeArrayToFile(arrayFromFile, "sorted" + filename);
    }
}

   


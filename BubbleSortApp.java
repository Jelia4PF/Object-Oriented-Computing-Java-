import java.io.*;
import java.util.*;

public class BubbleSortApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to generate a random array, or 2 to sort an existing file:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the length of the array:");
                int length = scanner.nextInt();
                int[] array = createRandomArray(length);
                writeArrayToFile(array, "unsorted.txt");
                System.out.println("Array generated and saved to 'unsorted.txt'");
                break;
            case 2:
                System.out.println("Enter the filename to read and sort:");
                scanner.nextLine(); // Clear the buffer
                String filename = scanner.nextLine();
                int[] arrayFromFile = readFileToArray(filename);
                bubbleSort(arrayFromFile);
                writeArrayToFile(arrayFromFile, "sorted.txt");
                System.out.println("Array sorted and saved to 'sorted.txt'");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        scanner.close();
    }

    public static int[] createRandomArray(int arrayLength) {
        Random rand = new Random();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101); // Random number between 0 and 100
        }
        return array;
    }

    public static void writeArrayToFile(int[] array, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int value : array) {
                writer.write(value + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] readFileToArray(String filename) {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(Integer.parseInt(line.trim()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void bubbleSort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }
}

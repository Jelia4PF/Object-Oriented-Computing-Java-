import java.io.*;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        Map<String, Integer> wordCounts = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        // Reading the input file and counting words
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Convert line to lower case to count words case-insensitively
                String word = line.toLowerCase();
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFilePath);
        } catch (IOException e) {
            System.out.println("Error reading from input file: " + inputFilePath);
        }

        // Writing the word counts to the output file
        try (PrintWriter writer = new PrintWriter(outputFilePath)) {
            wordCounts.forEach((word, count) -> writer.println(word + " " + count));
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to output file: " + outputFilePath);
        }
    }
}


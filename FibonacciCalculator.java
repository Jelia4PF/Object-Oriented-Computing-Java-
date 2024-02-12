public class FibonacciCalculator {

    public static void main(String[] args) {
        // Check if an argument was provided
        if (args.length < 1) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]); // Convert the first argument to an integer

        if (n < 0) {
            System.out.println("Please provide a non-negative number.");
            return;
        }

        int fibNumber = fibonacci(n); // Calculate the nth Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibNumber);
    }

    // Method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: return n if n is 0 or 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
        }
    }
}

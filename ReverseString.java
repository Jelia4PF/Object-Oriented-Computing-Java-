public class ReverseString {
    public static void main(String[] args) {
        // Example input
        String input = "Hello";
        String reversed = reverse(input);

        // Output the reversed string
        System.out.println(reversed);
    }

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}

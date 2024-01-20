import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Justins metric converter!");
        System.out.println("Enter your query in the format: <value> <unit_from> <unit_to>");
        System.out.println("For example: '1 kg lb'. Enter 'exit' to end the program.");

        while (true) {
            System.out.print("Enter your query: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 3) {
                System.out.println("Invalid input format. Please try again.");
                continue;
            }

            try {
                double value = Double.parseDouble(parts[0]);
                String unitFrom = parts[1].toLowerCase();
                String unitTo = parts[2].toLowerCase();
                double convertedValue = convert(value, unitFrom, unitTo);

                if (convertedValue != -1) {
                    System.out.println(value + " " + unitFrom + " = " + convertedValue + " " + unitTo);
                } else {
                    System.out.println("Conversion from " + unitFrom + " to " + unitTo + " is not supported.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Thank you for using the metric converter!");
    }

    private static double convert(double value, String unitFrom, String unitTo) {
        if ("kg".equals(unitFrom) && "lb".equals(unitTo)) {
            return value * 2.20462;
        } else if ("g".equals(unitFrom) && "oz".equals(unitTo)) {
            return value * 0.035274;
        } else if ("km".equals(unitFrom) && "mile".equals(unitTo)) {
            return value * 0.621371;
        } else if ("mm".equals(unitFrom) && "inch".equals(unitTo)) {
            return value * 0.0393701;
        } else {
            return -1;
        }
    }
}
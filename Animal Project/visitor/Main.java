package visitor;

public class Main {
    public static void main(String[] args) {
        // Creating instances 
        TicketsSold tickets = new TicketsSold(150);
        VisitorsCount visitors = new VisitorsCount(300); // Assuming 300 visitors
        VisitorFood food = new VisitorFood(200); // Assuming 200 food items sold
        RevenueCalculator revenueCalculator = new RevenueCalculator(150, 20.0, "USD"); // 150 tickets sold at $20 each

        // Updating and displaying ticket information
        tickets.setTicketType("General Admission");
        System.out.println("Tickets sold: " + tickets.getTicketsSold());
        System.out.println("Ticket type: " + tickets.getTicketType());

        // Updating and displaying visitor information
        visitors.setVisitLocation("Zoo");
        System.out.println("Number of visitors: " + visitors.getNumberOfVisitors());
        System.out.println("Visit location: " + visitors.getVisitLocation());

        // Updating and displaying food sales information
        food.setFoodType("Fast Food");
        System.out.println("Food items sold: " + food.getFoodItemsSold());
        System.out.println("Food type: " + food.getFoodType());

        // Calculating and displaying revenue
        System.out.println("Total revenue: " + revenueCalculator.calculateRevenue() + " " + revenueCalculator.getCurrency());
    }
}

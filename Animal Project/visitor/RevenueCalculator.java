package visitor;

public class RevenueCalculator extends TicketsSold {
    private double ticketPrice; // private member
    protected String currency; // protected member

    // Two constructors
    public RevenueCalculator() {
        super(); // Calls the default constructor of the superclass
        this.ticketPrice = 0.0;
        this.currency = "USD";
    }

    public RevenueCalculator(int ticketsSold, double ticketPrice, String currency) {
        super(ticketsSold); // Calls the constructor of the superclass with ticketsSold parameter
        this.ticketPrice = ticketPrice;
        this.currency = currency;
    }

    // Method overloading for updating ticket price
    public void updateTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void updateTicketPrice(String ticketPrice) {
        this.ticketPrice = Double.parseDouble(ticketPrice);
    }

    // Calculate total revenue
    public double calculateRevenue() {
        return getTicketsSold() * ticketPrice;
    }

    // Getter and Setter for ticket price
    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    // Getter and Setter for currency
    protected String getCurrency() {
        return currency;
    }

    protected void setCurrency(String currency) {
        this.currency = currency;
    }
}


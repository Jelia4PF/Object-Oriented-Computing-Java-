package visitor;

public class TicketsSold {
    private int ticketsSold; // private member
    protected String ticketType; // protected member

    // Two constructors
    public TicketsSold() {
        this.ticketsSold = 0; // Default constructor initializes ticketsSold to 0
    }

    public TicketsSold(int ticketsSold) {
        this.ticketsSold = ticketsSold;
    }

    // Method overloading for updating tickets sold
    public void updateTicketsSold(int ticketsSold) {
        this.ticketsSold = ticketsSold;
    }

    public void updateTicketsSold(String ticketsSold) {
        this.ticketsSold = Integer.parseInt(ticketsSold);
    }

    // Getter for tickets sold
    public int getTicketsSold() {
        return ticketsSold;
    }

    // Setter for tickets sold
    public void setTicketsSold(int ticketsSold) {
        this.ticketsSold = ticketsSold;
    }

    // Getter and Setter for ticket type
    protected String getTicketType() {
        return ticketType;
    }

    protected void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
}

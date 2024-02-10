package visitor;

public class VisitorsCount {
    private int numberOfVisitors; // private member
    protected String visitLocation; // protected member

    // Two constructors
    public VisitorsCount() {
        this.numberOfVisitors = 0; 
        this.visitLocation = "Main entrance"; // Default visit location
    }

    public VisitorsCount(int numberOfVisitors) {
        this.numberOfVisitors = numberOfVisitors;
        this.visitLocation = "Main entrance"; // Default visit location
    }

    // Method overloading for updating number of visitors
    public void updateNumberOfVisitors(int numberOfVisitors) {
        this.numberOfVisitors = numberOfVisitors;
    }

    public void updateNumberOfVisitors(String numberOfVisitors) {
        this.numberOfVisitors = Integer.parseInt(numberOfVisitors);
    }

    // Getter for number of visitors
    public int getNumberOfVisitors() {
        return numberOfVisitors;
    }

    // Setter for number of visitors
    public void setNumberOfVisitors(int numberOfVisitors) {
        this.numberOfVisitors = numberOfVisitors;
    }

    // Getter for visit location
    public String getVisitLocation() {
        return visitLocation;
    }

    // Setter for visit location
    protected void setVisitLocation(String visitLocation) {
        this.visitLocation = visitLocation;
    }
}

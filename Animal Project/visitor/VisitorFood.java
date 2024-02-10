// visitor package
package visitor;

public class VisitorFood implements VisitorCount {
    private int foodItemsSold; // private member
    protected String foodType; // protected member

    // Two constructors
    public VisitorFood() {
        this.foodItemsSold = 0; // Default constructor initializes foodItemsSold to 0
    }

    public VisitorFood(int foodItemsSold) {
        this.foodItemsSold = foodItemsSold;
    }

    // Method overloading for updating food items sold
    public void updateFoodItemsSold(int foodItemsSold) {
        this.foodItemsSold = foodItemsSold;
    }

    public void updateFoodItemsSold(String foodItemsSold) {
        this.foodItemsSold = Integer.parseInt(foodItemsSold);
    }

    // Getter for food items sold
    public int getFoodItemsSold() {
        return foodItemsSold;
    }

    // Setter for food items sold
    public void setFoodItemsSold(int foodItemsSold) {
        this.foodItemsSold = foodItemsSold;
    }

    // Getter and Setter for food type
    protected String getFoodType() {
        return foodType;
    }

    protected void setFoodType(String foodType) {
        this.foodType = foodType;
    }
    @Override
    public int countVisitors() {
        return foodItemsSold * 2;
    }
}
interface VisitorCount {
    int countVisitors();
}

 
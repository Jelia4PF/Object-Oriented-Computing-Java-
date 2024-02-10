package birds;

public abstract class Bird {
    protected String name; // protected member
    private float weight; // private member

    // Two constructors
    public Bird(String name) {
        this.name = name;
        this.weight = 0.0f;
    }

    public Bird(String name, float weight) {
        this(name);
        this.weight = weight;
    }

    // Abstract method
    public abstract void fly();

    // Public method
    public void sing() {
        System.out.println(name + " is singing");
    }

    // Method overloading with setters
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setWeight(String weight) {
        this.weight = Float.parseFloat(weight);
    }

    // Getters
    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }
}

package animals;

public class Lion extends Animal implements PredatorBehavior {
    private boolean isAlpha; // private member
    protected String prideName; // protected member

    // Two constructors
    public Lion(String name) {
        super(name);
        this.isAlpha = false;
    }

    public Lion(String name, int age, boolean isAlpha) {
        super(name, age);
        this.isAlpha = isAlpha;
    }

    // Overriding method from superclass
    @Override
    public void makeSound() {
        System.out.println(name + " roars");
    }

    // Implementing the method from PredatorBehavior interface
    @Override
    public void hunt() {
        System.out.println(name + " is hunting");
    }

    
    public void roar(int level) {
        System.out.println(name + " roars at level " + level);
    }

    public void roar(String mood) {
        System.out.println(name + " roars in a " + mood + " mood");
    }

    // Getters and Setters
    public boolean isAlpha() {
        return isAlpha;
    }

    public void setAlpha(boolean isAlpha) {
        this.isAlpha = isAlpha;
    }

    public String getPrideName() {
        return prideName;
    }

    public void setPrideName(String prideName) {
        this.prideName = prideName;
    }

    // Static and final method
    public static final void displayLionInfo() {
        System.out.println("Lions are known as the 'king of the jungle' and are powerful predators.");
    }
}


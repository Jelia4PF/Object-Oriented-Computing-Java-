package aquatic;

public class Dolphin extends AquaticAnimal {
    private boolean isTrained; // private member
    protected int intelligenceLevel; // protected member

    // Two constructors
    public Dolphin(String name) {
        super(name);
        this.isTrained = false;
    }

    public Dolphin(String name, int age, boolean isTrained) {
        super(name, age);
        this.isTrained = isTrained;
    }

    // Overridden method from superclass
    @Override
    public void swim() {
        System.out.println(name + " is performing acrobatic swims");
    }

    // Public methods demonstrating method overloading
    public void performShow() {
        if (isTrained) {
            System.out.println(name + " is performing a show");
        } else {
            System.out.println(name + " is not trained for shows");
        }
    }

    public void performShow(String trick) {
        if (isTrained) {
            System.out.println(name + " performs the " + trick);
        } else {
            System.out.println(name + " cannot perform " + trick + " as it is not trained");
        }
    }

    public static void dolphinInfo() {
        System.out.println("Dolphins are intelligent aquatic mammals known for their playful behavior.");
    }

    // Getters and Setters
    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }

    public int getIntelligenceLevel() {
        return intelligenceLevel;
    }

    public void setIntelligenceLevel(int intelligenceLevel) {
        this.intelligenceLevel = intelligenceLevel;
    }
}

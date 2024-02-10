package birds;

public class Eagle extends Bird {
    private boolean isMajestic; // private member
    protected String habitat; // protected member

    // Two constructors
    public Eagle(String name) {
        super(name);
        this.isMajestic = false;
    }

    public Eagle(String name, float weight, boolean isMajestic) {
        super(name, weight);
        this.isMajestic = isMajestic;
    }

    // Overridden method from superclass
    @Override
    public void fly() {
        System.out.println(name + " is soaring through the sky");
    }

    // Public methods demonstrating method overloading
    public void scream(int volume) {
        System.out.println(name + " screams at volume level " + volume);
    }

    public void scream(boolean isLoud) {
        if (isLoud) {
            System.out.println(name + " screams loudly");
        } else {
            System.out.println(name + " screams softly");
        }
    }

    // Getters and Setters
    public boolean isMajestic() {
        return isMajestic;
    }

    public void setMajestic(boolean isMajestic) {
        this.isMajestic = isMajestic;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Final method
    public final void displayEagleInfo() {
        System.out.println("Eagles are majestic birds known for their powerful flight and keen eyesight.");
    }
}

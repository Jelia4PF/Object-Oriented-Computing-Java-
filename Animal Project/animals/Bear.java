package animals;

public class Bear extends Animal {
    private boolean isHibernating; // private member
    protected String habitat; // protected member

    // Two constructors
    public Bear(String name) {
        super(name);
        this.isHibernating = false;
    }

    public Bear(String name, int age, boolean isHibernating) {
        super(name, age);
        this.isHibernating = isHibernating;
    }

    // Overridden method from superclass
    @Override
    public void makeSound() {
        System.out.println(name + " roars like a bear");
    }

    public void hibernate(int duration) {
        System.out.println(name + " is hibernating for " + duration + " months");
    }

    public void hibernate(boolean isHibernating) {
        this.isHibernating = isHibernating;
        if (isHibernating) {
            System.out.println(name + " is now hibernating");
        } else {
            System.out.println(name + " is now awake from hibernation");
        }
    }

    public final void bearInfo() {
        System.out.println("Bears are large mammals found in various habitats around the world.");
    }

    // Getters and Setters
    public boolean isHibernating() {
        return isHibernating;
    }

    public void setHibernating(boolean isHibernating) {
        this.isHibernating = isHibernating;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}


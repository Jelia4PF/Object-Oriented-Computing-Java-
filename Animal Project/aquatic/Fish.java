package aquatic;

public class Fish extends AquaticAnimal {
    private String species; // Private member for the species of the fish
    protected String habitat; // Protected member for the habitat of the fish

    // Constructor that initializes the fish's name and species
    public Fish(String name, String species) {
        super(name);
        this.species = species;
    }

    // Constructor that initializes the fish's name, age, and species
    public Fish(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    // Overridden method from the AquaticAnimal superclass
    @Override
    public void swim() {
        System.out.println(name + " the " + species + " is swimming");
    }

    // Static method providing general information about fish
    public static void generalFishInfo() {
        System.out.println("Fish are aquatic animals that live in water.");
    }

    public static void habitatInfo() {
        System.out.println("Fish habitats vary from freshwater rivers and lakes to saltwater oceans.");
    }

    // Getter for the species of the fish
    public String getSpecies() {
        return species;
    }

    // Setter for the species of the fish
    public void setSpecies(String species) {
        this.species = species;
    }

    // Getter for the habitat of the fish
    public String getHabitat() {
        return habitat;
    }

    // Setter for the habitat of the fish
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}

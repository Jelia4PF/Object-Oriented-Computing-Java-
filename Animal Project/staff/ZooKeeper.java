package staff;

import animals.Animal;

public class ZooKeeper implements Caregiver {
    private String name; // Private member

    // Inner protected class
    protected class AnimalCareReport {
        private String reportDetails;

        public AnimalCareReport(String details) {
            this.reportDetails = details;
        }

        public String getDetails() {
            return reportDetails;
        }
    }

    // Two constructors
    public ZooKeeper(String name) {
        this.name = name;
    }

    public ZooKeeper(String name, int experienceYears) {
        this.name = name;
    }

    // Public method marked as final
    @Override
    public final void feedAnimal(Animal animal, String food) {
        System.out.println(name + " is feeding " + food + " to " + animal.getName());
    }

    // Public method with overloading
    @Override
    public void cleanAnimalEnclosure(Animal animal, String tool) {
        System.out.println(name + " is cleaning the enclosure of " + animal.getName() + " with " + tool);
    }
    public AnimalCareReport createReport(String details) {
        return new AnimalCareReport(details);
    }

    // Static method
    public static void generalZookeeperInfo() {
        System.out.println("Zookeepers are responsible for the care and maintenance of animals in a zoo.");
    }

    // Getters
    public String getName() {
        return name;
    }
}
interface Caregiver {
    void feedAnimal(Animal animal, String food);
    void cleanAnimalEnclosure(Animal animal, String tool);
}

package staff;

import animals.Animal;

public final class Veterinarian {
    private String name; // private member

    // Two constructors
    public Veterinarian(String name) {
        this.name = name;
    }

    public Veterinarian(String name, int experienceYears) {
        this.name = name;
    }

    // Public method
    public void checkHealth(Animal animal) {
        System.out.println(name + " is checking the health of " + animal.getName());
    }

    // Public method with overloading
    public void treatAnimal(Animal animal, String treatment) {
        System.out.println(name + " is treating " + animal.getName() + " with " + treatment);
    }

    // Getters
    public String getName() {
        return name;
    }

    // Protected class
    protected final class VeterinaryAssistant {
        // Public method with method overloading
        public void assistTreatment(Animal animal, String treatment) {
            System.out.println(name + " is assisting in treating " + animal.getName() + " with " + treatment);
        }

        public void assistTreatment(Animal animal) {
            System.out.println(name + " is assisting in treating " + animal.getName());
        }
    }
}

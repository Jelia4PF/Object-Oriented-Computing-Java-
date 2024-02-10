package staff;

import animals.Animal;
interface Trainer {
    void trainAnimal(Animal animal, String behavior);
}

public class ZooTrainer implements Trainer {
    private String name; // private member
    private String trainingSpecialty; // private member
    protected String trainingLocation; // protected member

    // Two constructors
    public ZooTrainer(String name) {
        this.name = name;
    }

    public ZooTrainer(String name, int experienceYears) {
        this.name = name;
    }

    // Overloaded constructor
    public ZooTrainer(String name, int experienceYears, String trainingSpecialty) {
        this.name = name;
        this.trainingSpecialty = trainingSpecialty;
    }

    // Implementation of interface method
    @Override
    public void trainAnimal(Animal animal, String behavior) {
        System.out.println(name + " is training " + animal.getName() + " to " + behavior);
    }

    public String getTrainingSpecialty() {
        return trainingSpecialty;
    }

    public void setTrainingSpecialty(String trainingSpecialty) {
        this.trainingSpecialty = trainingSpecialty;
    }

    public String getTrainingLocation() {
        return trainingLocation;
    }

    protected void setTrainingLocation(String trainingLocation) {
        this.trainingLocation = trainingLocation;
    }
}

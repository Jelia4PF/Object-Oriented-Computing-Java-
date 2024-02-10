package aquatic;

public abstract class AquaticAnimal {
    protected String name; // protected member
    private int age; // private member

    // Two constructors
    public AquaticAnimal(String name) {
        this.name = name;
        this.age = 0;
    }

    public AquaticAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract void swim();

    // Public method
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    
    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(String estimatedAge) {
        this.age = Integer.parseInt(estimatedAge);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


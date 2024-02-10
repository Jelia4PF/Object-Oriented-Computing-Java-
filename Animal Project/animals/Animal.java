package animals;

public abstract class Animal {
    protected String name; // protected member
    private int age; // private member

    // Two constructors
    public Animal(String name) {
        this.name = name;
        this.age = 0;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract void makeSound();

    // Public method
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    // Public getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Public setters with method overloading
    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(String estimatedAge) {
        this.age = Integer.parseInt(estimatedAge);
    }
}

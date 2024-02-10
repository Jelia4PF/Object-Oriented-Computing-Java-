package animals;

public class Main {
    public static void main(String[] args) {
       
        Bear bear = new Bear("Baloo");
        Lion lion = new Lion("Simba", 5, true);

         
        bear.makeSound();
        bear.hibernate(3);
        bear.bearInfo();

         
        lion.makeSound();
        lion.hunt();
        Lion.displayLionInfo(); // Calling static method

        Animal animalBear = new Bear("Yogi");
        Animal animalLion = new Lion("Mufasa");

       
        animalBear.makeSound();
        animalLion.makeSound();

        // Display information
        System.out.println("Bear Name: " + animalBear.getName());
        System.out.println("Lion Name: " + animalLion.getName());
    }
}

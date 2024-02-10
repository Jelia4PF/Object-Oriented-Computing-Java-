package aquatic;

public class Main {
    public static void main(String[] args) {
        // Instances of Fish and Dolphin
        Fish goldfish = new Fish("Goldie", "Goldfish");
        Dolphin bottlenose = new Dolphin("Flipper", 7, true);

        // Call methods from the Fish class
        goldfish.swim();
        Fish.generalFishInfo();
        Fish.habitatInfo();

        // Call methods from the Dolphin class
        bottlenose.swim();
        bottlenose.performShow();
        bottlenose.performShow("backflip");
        Dolphin.dolphinInfo();

        AquaticAnimal aquaticFish = new Fish("Nemo", "Clownfish");
        AquaticAnimal aquaticDolphin = new Dolphin("Echo");

        // Polymorphic method calls
        aquaticFish.swim();
        aquaticDolphin.swim();

        // Display information
        System.out.println("Fish Name: " + aquaticFish.getName());
        System.out.println("Dolphin Name: " + aquaticDolphin.getName());
    }
}

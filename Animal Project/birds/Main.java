package birds;

public class Main {
    public static void main(String[] args) {
        // Instances of Parrot and Eagle
        Parrot parrot = new Parrot("Polly", 2, true);
        Eagle eagle = new Eagle("Eddy", 4.5f, true);

        parrot.fly();
        parrot.talk(100); 
        parrot.setFavoriteWord("Hello");
        System.out.println("Parrot's favorite word: " + parrot.getFavoriteWord());

        eagle.fly();
        eagle.scream(10); 
        eagle.displayEagleInfo(); 

        Bird myParrot = new Parrot("Pip", 3, false);
        Bird myEagle = new Eagle("Eva", 3.0f, false);

        myParrot.fly(); 
        myEagle.fly();  

        myParrot.sing();
        myEagle.sing();
    }
}


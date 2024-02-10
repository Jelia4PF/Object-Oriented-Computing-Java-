package Main;

import animals.*;
import birds.*;
import staff.*;
import visitor.*;
import aquatic.*;

public class Solo {
    public static void main(String[] args) {
        Lion lion = new Lion("Leo");
        Veterinarian vet = new Veterinarian("Dr. Jane");
        vet.checkHealth(lion);

        Parrot parrot = new Parrot("Polly", 2, true);
        Eagle eagle = new Eagle("Eddy", 4.5f, true);
        parrot.fly();
        eagle.fly();

        ZooKeeper keeper = new ZooKeeper("Bob");
        keeper.feedAnimal(lion, "meat");

        // Utilizing the tickets variable
        TicketsSold tickets = new TicketsSold(150);
        System.out.println("Tickets sold: " + tickets.getTicketsSold());

        RevenueCalculator revenueCalculator = new RevenueCalculator(150, 20.0, "USD");
        System.out.println("Total revenue: " + revenueCalculator.calculateRevenue() + " USD");

        AquaticAnimal dolphin = new Dolphin("Flipper");
        dolphin.swim();
        Fish goldfish = new Fish("Goldie", "Goldfish");
        goldfish.swim();
    }
}


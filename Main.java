package org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel;

import org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Communication.ConsoleLogChristmas;
import org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Communication.ContactElf;
import org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Communication.EventBoard;
import org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Communication.FileLogChristmas;
import org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Decoration.RibbonGiftDecorator;
import org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Decoration.WordGiftDecorator;
import org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Decoration.WrapGiftDecorator;
import org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Fabrication.*;

public class Main {
    public static void main(String[] args) {

        // factories integration

        ToyFactory societyToyFactory = new SocietyToyFactory();
        ToyFactory plushToyFactory = new PlushToyFactory();
        ToyFactory consoleToyFactory = new ConsoleToyFactory();

        EventBoard eventBoard = new EventBoard(); // adding communication segment

        // new toys creation

        Toy society1 = societyToyFactory.createToy();
        Toy plush1 = plushToyFactory.createToy();
        Toy console1 = consoleToyFactory.createToy();

        // sending toys to the warehouse for decoration and/or delivery

        society1.sentToWarehouse();
        eventBoard.createEvent("A Toy has been created and sent to the warehouse");
        plush1.sentToWarehouse();
        eventBoard.createEvent("A Toy has been created and sent to the warehouse");
        console1.sentToWarehouse();
        eventBoard.createEvent("A Toy has been created and sent to the warehouse");

        // decoration of the Toy/Christmas gift

        society1 = new WrapGiftDecorator(society1); // wrapping of the society game
        System.out.println(society1.getDescription());

        plush1 = new RibbonGiftDecorator(plush1);
        System.out.println(plush1.getDescription()); // ribbon on the plush

        plush1 = new WordGiftDecorator(plush1); // adding a second decoration on the plush
        System.out.println(plush1.getDescription()); // little word on the plush that wasn't there at the previous step

        console1 = new WrapGiftDecorator(console1);// wrapping the console
        console1 = new WordGiftDecorator(console1); // also adding a word on the console
        System.out.println(console1.getDescription());

        // communication with the elf team.
        // import basic element for the program

        eventBoard.addElf(new FileLogChristmas());
        eventBoard.addElf(new ConsoleLogChristmas());
        eventBoard.addElf(new ContactElf());




    }
}

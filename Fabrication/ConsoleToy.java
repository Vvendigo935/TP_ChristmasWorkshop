package org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Fabrication;

public class ConsoleToy implements Toy{
    @Override
    public void sentToWarehouse() {
        System.out.println("A new video game Console has been created and sent to the Warehouse for the wrapping !");
    }

    @Override
    public String getDescription() {
        return " This is a video game console. ";
    }
}

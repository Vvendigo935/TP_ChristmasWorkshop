package org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Fabrication;

public class SocietyToy implements Toy{
    @Override
    public void sentToWarehouse() {
        System.out.println("A new Society game has been created and sent to the Warehouse for the wrapping !");
    }

    @Override
    public String getDescription() {
        return " This is a society game for all family ! ";
    }
}

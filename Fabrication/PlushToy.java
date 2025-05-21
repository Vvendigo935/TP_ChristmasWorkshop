package org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Fabrication;

public class PlushToy implements Toy{
    @Override
    public void sentToWarehouse() {
        System.out.println("A new plushe has been created and sent to the Warehouse for the wrapping !");
    }

    @Override
    public String getDescription() {
        return " This is a plushie. ";
    }
}

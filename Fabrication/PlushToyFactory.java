package org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Fabrication;

public class PlushToyFactory extends ToyFactory{

    @Override
    public Toy createToy() {
        return new PlushToy();
    }
}

package org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Fabrication;

public class ConsoleToyFactory extends ToyFactory{
    @Override
    public Toy createToy() {
        return new ConsoleToy();
    }
}

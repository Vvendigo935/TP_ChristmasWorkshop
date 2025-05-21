package org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Fabrication;

public class SocietyToyFactory extends ToyFactory{
    @Override
    public Toy createToy() {
        return new SocietyToy();
    }
}

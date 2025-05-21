package org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Decoration;

import org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Fabrication.Toy;

public abstract class GiftDecorator implements Toy {

    protected Toy gift; // toy ?

    public GiftDecorator(Toy gift){
        this.gift = gift;
    }

    @Override
    public void sentToWarehouse() {

    }

    @Override
    public String getDescription() {
        return gift.getDescription();
    }
}

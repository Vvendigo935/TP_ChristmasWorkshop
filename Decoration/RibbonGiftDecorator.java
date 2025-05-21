package org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Decoration;

import org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Fabrication.Toy;

public class RibbonGiftDecorator extends GiftDecorator{
    public RibbonGiftDecorator(Toy gift) {
        super(gift);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" , this toy also have now a ribbon. ";
    }
}
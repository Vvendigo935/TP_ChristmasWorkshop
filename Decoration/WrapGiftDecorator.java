package org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Decoration;

import org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Fabrication.Toy;

public class WrapGiftDecorator extends GiftDecorator {
    public WrapGiftDecorator(Toy gift) {
        super(gift);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" , this toy has been wrapped. ";
    }
}

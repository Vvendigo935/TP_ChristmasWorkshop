package org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Decoration;

import org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Fabrication.Toy;

public class WordGiftDecorator extends GiftDecorator{
    public WordGiftDecorator(Toy gift) {
        super(gift);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" , with a little word from the person on it. ";
    }
}

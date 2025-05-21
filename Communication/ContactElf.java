package org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Communication;

public class ContactElf implements ElfAgent{
    @Override
    public void notifyElf(String event) {
        System.out.println("Dear Christmas worker, something happened : "+event);
    }
}

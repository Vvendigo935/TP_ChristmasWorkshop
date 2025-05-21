package org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Communication;

public class FileLogChristmas implements ElfAgent{
    @Override
    public void notifyElf(String event) {
        System.out.println("Registering in the Christmas log file : "+event);
    }
}

package org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Communication;

public class ConsoleLogChristmas implements ElfAgent{
    @Override
    public void notifyElf(String event) {
        System.out.println("The Christmas console detected : "+event+" ! ");
    }
}

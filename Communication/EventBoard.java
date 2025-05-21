package org.example.DesignPatern.ExoDesignPatern.ExoTPatelierPapaNoel.Communication;

import java.util.ArrayList;
import java.util.List;

public class EventBoard {

    private List<ElfAgent> elfAgents = new ArrayList<>();

    public void addElf(ElfAgent elfAgent){
        elfAgents.add(elfAgent);
    }

    public void removeElf(ElfAgent elfAgent){
        elfAgents.remove(elfAgent);
    }

    public void createEvent(String nameEvent){

        notifyElf(nameEvent);
    }

    public void notifyElf(String event){
        for (ElfAgent elfAgent: elfAgents){
            elfAgent.notifyElf(event);
        }
    }









}

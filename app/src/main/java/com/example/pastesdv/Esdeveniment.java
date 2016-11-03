package com.example.pastesdv;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by niloleart on 3/11/16.
 */

public class Esdeveniment {

    private String name;
    private String description;
    private int assistents;
    private double latitud, longitud;
    private Esdeveniment[] pastEvents;

    public Esdeveniment(String name, String description, int assistents, double latitud, double longitud){
        this.name = name;
        this.description = description;
        this.assistents = assistents;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public void addPastEvents(Esdeveniment[] esdeveniments){
        pastEvents = new Esdeveniment[esdeveniments.length];
    }

    public Esdeveniment[] getPastEvents() {
        return pastEvents;
    }

    public ArrayList<String> getPastEventsListName(){
        ArrayList<String> noms = new ArrayList<String>();
        for (Esdeveniment esdv:pastEvents) {
            noms.add(esdv.name);
        }
        return noms;
    }
}

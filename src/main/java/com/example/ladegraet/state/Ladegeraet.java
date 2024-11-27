package com.example.ladegraet.state;


public class Ladegeraet {
    private Zustand zustand;
    private int ladestand;

    public Ladegeraet() {
        this.zustand = NichtLadend.getLadend();
        this.ladestand = 0;
    }

    public void setZustand(Zustand zustand) {
        this.zustand = zustand;
    }

    public int getLadestand() {
        return ladestand;
    }

    public void auslösen() {
        zustand.bearbeiten(this);
    }
}


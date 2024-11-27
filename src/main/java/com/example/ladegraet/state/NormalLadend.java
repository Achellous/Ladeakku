package com.example.ladegraet.state;

public class NormalLadend extends Zustand {
    private static NormalLadend normalLadend = new NormalLadend();

    private NormalLadend() {
    }

    public static NormalLadend getLadend() {
        return normalLadend;
    }

    @Override
    public void bearbeiten(Ladegeraet ladegreat) {
        System.out.println("Ladegerät lädt normal.");
    }
}


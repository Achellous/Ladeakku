package com.example.ladegraet.state;

public class NichtLadend extends Zustand {
    private static NichtLadend nichtLadend = new NichtLadend();

    private NichtLadend() {
    }

    public static NichtLadend getLadend() {
        return nichtLadend;
    }

    @Override
    public void bearbeiten(Ladegeraet ladegreat) {
        System.out.println("Ladegerät ist nicht ladend. Zustand bleibt unverändert.");
    }
}


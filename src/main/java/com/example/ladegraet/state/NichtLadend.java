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
        if (ladegerät.getLadestand() < 20) {
            System.out.println("Akkustand < 20%: Akku defekt. Zustand bleibt NichtLadend.");
        } else if (ladegerät.getLadestand() >= 20 && ladegerät.getLadestand() < 100) {
            System.out.println("Akkustand >= 20%: Wechsel zu NormalLadend.");
            ladegerät.setZustand(NormalLadend.getLadend());
    }
}


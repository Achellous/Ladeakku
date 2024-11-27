package com.example.ladegraet.state;

public class NichtLadend extends Zustand {
    private static NichtLadend nichtLadend = new NichtLadend();

    private NichtLadend() {
    }

    public static NichtLadend getLadend() {
        return nichtLadend;
    }


    @Override
    public void bearbeiten(Ladegeraet ladegeraet) {
        if (ladegeraet.getLadestand() < 20) {
        } else if (ladegeraet.getLadestand() >= 20 && ladegeraet.getLadestand() < 100) {
            ladegeraet.setZustand(NormalLadend.getLadend());
        }
    }
}


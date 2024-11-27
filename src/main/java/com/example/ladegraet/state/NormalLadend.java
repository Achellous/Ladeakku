package com.example.ladegraet.state;

public class NormalLadend extends Zustand {
    private static NormalLadend normalLadend = new NormalLadend();

    private NormalLadend() {
    }

    public static NormalLadend getLadend() {
        return normalLadend;
    }

    @Override
    public void bearbeiten(Ladegeraet ladegeraet) {
        if (ladegeraet.getLadestand() < 80) {
            ladegeraet.setZustand(SchnellLadend.getLadend());
        } else if (ladegeraet.getLadestand() >= 80) {
        }
    }
}

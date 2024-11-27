package com.example.ladegraet.state;

public class SchnellLadend extends Zustand {
    private static SchnellLadend schnellLadend = new SchnellLadend();

    private SchnellLadend() {
    }

    public static SchnellLadend getLadend() {
        return schnellLadend;
    }

    @Override
    public void bearbeiten(Ladegeraet ladegreat) {
        System.out.println("Ladegeraet lädt schnell.");
    }
}


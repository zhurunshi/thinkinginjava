package pers.rush.beginner._30_多态_再论向上转型;

enum Note {
    Middle_C,
    C_SHARP,
    B_FLAT;
}

class Instrument {
    public void play(Note note) {
        System.out.println("Instrument.play()");
    }
}

public class Wind extends Instrument {
    public void play(Note note) {
        System.out.println("Wind.play()");
    }
}

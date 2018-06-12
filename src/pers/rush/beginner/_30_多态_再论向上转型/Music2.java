package pers.rush.beginner._30_多态_再论向上转型;

class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println("Stringed.play()");
    }
}

class Brass extends Instrument {
    public void play(Note n) {
        System.out.println("Brass.play()");
    }
}

public class Music2 {
    public static void tune(Wind w) {
        w.play(Note.Middle_C);
    }
    public static void tune(Stringed s) {
        s.play(Note.Middle_C);
    }
    public static void tune(Brass b) {
        b.play(Note.Middle_C);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}

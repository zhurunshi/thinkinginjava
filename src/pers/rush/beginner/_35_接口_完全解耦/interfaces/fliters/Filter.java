package pers.rush.beginner._35_接口_完全解耦.interfaces.fliters;

public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input) {
        return input;
    }
}

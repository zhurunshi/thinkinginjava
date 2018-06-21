package pers.rush.beginner._35_接口_完全解耦.interfaces.fliters;

public class BandPass extends Filter{
    double lowCutoff, highCutoff; // 截止频率值
    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}

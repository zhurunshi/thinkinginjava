package pers.rush.beginner._35_接口_完全解耦.interfaces.fliters;

/**
 * 高通滤波器
 * @author Rush
 *
 */
public class HighPass extends Filter{
    double cutoff; // 截止频率值
    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input) {
        return input;
    }
}

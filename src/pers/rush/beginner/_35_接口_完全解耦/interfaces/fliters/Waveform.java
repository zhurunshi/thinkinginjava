package pers.rush.beginner._35_接口_完全解耦.interfaces.fliters;

public class Waveform {
    private static long counter; // 计数
    private final long id = counter++; // id
    public String toString() {
        return "Waveform " + id;
    }
    
}

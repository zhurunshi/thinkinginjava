package pers.rush.beginner._35_接口_完全解耦.interfaces.interfaceprocessor;

import pers.rush.beginner._35_接口_完全解耦.interfaces.fliters.BandPass;
import pers.rush.beginner._35_接口_完全解耦.interfaces.fliters.HighPass;
import pers.rush.beginner._35_接口_完全解耦.interfaces.fliters.LowPass;
import pers.rush.beginner._35_接口_完全解耦.interfaces.fliters.Waveform;

public class FilterProcessor {

    public static void main(String[] args) {
        Apply.process(new FilterAdapter(new LowPass(1.0)), new Waveform());
        Apply.process(new FilterAdapter(new HighPass(2.0)), new Waveform());
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), new Waveform());
        Apply.process(new FilterAdapter(new LowPass(1.0)), new Waveform());
        Apply.process(new FilterAdapter(new HighPass(2.0)), new Waveform());
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), new Waveform());
        
    }

}

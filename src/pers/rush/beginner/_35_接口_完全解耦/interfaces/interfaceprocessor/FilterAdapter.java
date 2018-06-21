package pers.rush.beginner._35_接口_完全解耦.interfaces.interfaceprocessor;

import pers.rush.beginner._35_接口_完全解耦.interfaces.fliters.Filter;
import pers.rush.beginner._35_接口_完全解耦.interfaces.fliters.Waveform;

/**
 * 滤波适配器
 * @author Rush
 *
 */
public class FilterAdapter implements Processor{
    Filter filter; // 被包装的对象
    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }
    @Override
    public String name() {
        return filter.name();
    }
    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
    
}

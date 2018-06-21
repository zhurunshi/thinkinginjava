package pers.rush.beginner._35_接口_完全解耦.interfaces.interfaceprocessor;

import java.util.Arrays;

public abstract class StringProcessor implements Processor{

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract Object process(Object input);
    
}

class Upcase extends StringProcessor{

    @Override
    public Object process(Object input) {
        return ((String) input).toUpperCase();
    }
    
}

class Downcase extends StringProcessor{

    @Override
    public Object process(Object input) {
        return ((String) input).toLowerCase();
    }
    
}

class Splitter extends StringProcessor{

    @Override
    public Object process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
    
}
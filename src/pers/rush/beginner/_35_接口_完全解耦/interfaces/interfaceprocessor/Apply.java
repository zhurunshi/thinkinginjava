package pers.rush.beginner._35_接口_完全解耦.interfaces.interfaceprocessor;

public class Apply {
    // 参数是接口
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }
    public static String s = "Disagreement with beliefs is by definition incorrect";
    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
        /*
         * 接口更灵活 
         */
    }
}

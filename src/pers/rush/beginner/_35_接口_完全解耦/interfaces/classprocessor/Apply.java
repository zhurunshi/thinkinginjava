package pers.rush.beginner._35_接口_完全解耦.interfaces.classprocessor;

import java.util.Arrays;

/**
 * 处理器
 * @author Rush
 *
 */
class Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    // 协变返回类型,返回Object的子类,也属于覆盖
    String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processor {
    // 协变返回类型,返回Object的子类,也属于覆盖
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Apply {
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
         * 虽然接口定义的是父类的类型,可以使用多态
         * 也可以扩展
         * 但是还没有完全解耦
         * 想要完全解耦,要声明为接口类型
         */
    }
}

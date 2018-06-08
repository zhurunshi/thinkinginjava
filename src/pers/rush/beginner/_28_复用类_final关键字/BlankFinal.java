package pers.rush.beginner._28_复用类_final关键字;

class Poppet {
    private int i;
    Poppet(int ii) {
        this.i = ii;
    }
}

public class BlankFinal {
    private final int i = 0;
    private final int j; // 空白final,确保使用前必须初始化=>必须写构造器
    private final Poppet poppet;
    public BlankFinal() {
        j = 1;
        poppet = new Poppet(2);
    }
    public BlankFinal(final int x) { 
        // 会报错,因为调用这个构造器的时候,没有对final变量初始化
        j = x;
        poppet = new Poppet(x);
//        ++x; // 不能更改
    }
    public static void main(String[] args) {
        // 如果放到参数里,说明参数在方法里面是不能更改的
        // 任何一个private方法,本质上都是一个final方法
    }

}

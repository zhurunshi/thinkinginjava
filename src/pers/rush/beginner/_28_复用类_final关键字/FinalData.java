package pers.rush.beginner._28_复用类_final关键字;

import java.util.Random;

class Value {
    int i;

    public Value(int i) {
        super();
        this.i = i;
    }
    
}

public class FinalData {
    private static Random rand = new Random(47);
    private String id;
    public FinalData(String id) {
        this.id = id;
    }
    private final int VALUE_ONE = 9;
    private static final int VALUE_TWO = 99;
    public static final int VALUE_THREE = 39;
    private final int I4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    private static final int[] a = {1,2,3,4,5,6};
    public String toString() {
        return id + ": I4 = " + I4 + ", INT_5 = " + INT_5;
    }
    public static void main(String[] args) {
        /* 
         * final数据:
         *   1.空白final
         *   2.final参数
         * final方法
         * final类
         * 
         * 如果基本数据类型为final定义的,那么说明值永不改变
         * 如果是引用数据类型,则说明地址永远不变,但是对象本身是可以改变的
         */
        
        FinalData fd1 = new FinalData("fd1");
//        fd1.VALUE_ONE = 2; // 错的
        fd1.v2.i++;
        fd1.v1 = new Value(9);
        for(int i = 0; i < fd1.a.length; ++i) {
            ++fd1.a[i];
        }
        System.out.println(fd1);
        System.out.println("创建一个新的FinalData数据");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd2);
    }

}

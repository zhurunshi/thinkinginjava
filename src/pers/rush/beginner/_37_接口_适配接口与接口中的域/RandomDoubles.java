package pers.rush.beginner._37_接口_适配接口与接口中的域;

import java.util.Random;

public class RandomDoubles {
    private static Random rand = new Random(47);
    
    public double next() {
        return rand.nextDouble();
    }
    
    public static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles();
        for (int i = 0; i < 7; ++i) {
            System.out.println(rd.next() + " ");
        }
    }
   
    // 需求: 想把这个类用到Scanner()类的参数里面,怎么办?
    // 不能修改现有的类,只能在上面做扩展
    // 使用适配器模式,新写类,继承RandomDoubles,实现Readable接口
    // 还有一个适配器模式是使用组合
}

 package pers.rush.intermediate._19_泛型_通配符一;

import java.util.ArrayList;
import java.util.List;

/**
  * 泛型和协变
  * @author Rush
  * @date 2020/02/06
  */
public class GenericsAndCovariance {
    public static void main(String[] args) {
        // 使用通配符限制类型
        // 任何从Fruit继承的类都能放
        List<? extends Fruit> flist = new ArrayList<Apple>();
//        flist.add(new Apple());
        Fruit f = flist.get(0);
        
    }
}

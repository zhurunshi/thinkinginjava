package pers.rush.intermediate._21_泛型_问题;

import java.util.ArrayList;
import java.util.List;

/**
 * 解决:任何基本类型都不能作为类型参数
 * @author Rush
 * @date 2020/03/08
 */
public class ListOfInt {
    public static void main(String[] args) {
        // 泛型里面的类型不能用基本数据类型
//        List<int>li = new ArrayList<int>();
        // 变为包装类
        List<Integer>li = new ArrayList<Integer>();
        for(int i = 0; i < 5; ++i) {
            li.add(i); // 自动包装 自动转换成Integer对象
        }
        for(int i : li) {
            System.out.print(i + "  ");
        }
    }
}

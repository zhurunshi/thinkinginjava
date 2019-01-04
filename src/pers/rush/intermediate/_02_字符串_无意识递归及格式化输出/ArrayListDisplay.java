package pers.rush.intermediate._02_字符串_无意识递归及格式化输出;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDisplay {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,12,13,14);
        List<Integer> listnew = new ArrayList<>();
        listnew.add(0);
        System.out.println("listnew=" + listnew);
        System.out.println("list=" + list);
    }

}

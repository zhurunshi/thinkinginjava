 package pers.rush.intermediate._19_泛型_通配符一;

import java.util.Arrays;
import java.util.List;

public class CompilerIntelligence {
     public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0);
        Fruit f = flist.get(0);
        flist.contains(new Apple());
        flist.indexOf(new Apple());
    }
}

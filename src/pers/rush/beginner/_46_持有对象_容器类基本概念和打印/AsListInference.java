package pers.rush.beginner._46_持有对象_容器类基本概念和打印;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Snow {

}

class Powder extends Snow {
    
}

class Light extends Powder{
    
}

class Crusty extends Snow {
    
}

class Slush extends Snow {
    
}

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snowl = Arrays.asList(new Crusty(), new Slush());
        List<Snow> snow2 = new ArrayList<Snow>();
//        Snow[] sa = new Snow[snow2, snow2,toArray(sa)];
//        Collection.addAll(snow3, snow2, toArray(Snow));
        System.out.println();
    }
}

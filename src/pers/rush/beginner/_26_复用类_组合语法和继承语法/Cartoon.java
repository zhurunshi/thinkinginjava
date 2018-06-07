package pers.rush.beginner._26_复用类_组合语法和继承语法;

class Drawing extends Art{
    Drawing() {
        System.out.println("Drawing构造器");
    }
}

class Art {
    Art(){
        System.out.println("Art构造器");
    }
}

public class Cartoon extends Drawing{
    public Cartoon() {
        System.out.println("Cartoon构造器");
    }
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}

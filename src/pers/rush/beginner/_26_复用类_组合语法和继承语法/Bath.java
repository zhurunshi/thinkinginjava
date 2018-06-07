package pers.rush.beginner._26_复用类_组合语法和继承语法;

class Soap {
    private String s;
    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }
    public String toString() {
        return s;
    }
}

public class Bath {
    // 第一种初始化方式,声明时初始化
    private String s1 = "Happy",
            s2 = "Happy",
            s3,
            s4;
    private Soap castille;
    private int i;
    private float toy;
    public Bath() {
        System.out.println("Bath()");
        // 第二种方式,构造器内初始化
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }
    // 第三种方式,实例初始化
    {
        i = 47;
    }
    // 第四种方式,延迟初始化(惰性初始化,节省内存资源)
    public String toString() {
        if (s4 == null) {
            s4 = "Joy";
        }
        return "s1=" + s1 + "\n"
                + "s2=" + s2 + "\n"
                + "s3=" + s3 + "\n"
                + "s4=" + s4 + "\n"
                + "i=" + i + "\n"
                + "toy=" +toy + "\n"
                + "castille=" + castille + "\n";
    }
    public static void main(String[] args) {
        Bath bath = new Bath();
        System.out.println(bath);
    }

}

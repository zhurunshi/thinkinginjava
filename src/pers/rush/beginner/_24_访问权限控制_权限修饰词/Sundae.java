package pers.rush.beginner._24_访问权限控制_权限修饰词;

public class Sundae {
    
    private Sundae() {}
    
    static Sundae makeSundae() {
        return new Sundae();
    }

}

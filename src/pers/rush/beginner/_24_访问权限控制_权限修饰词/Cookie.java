package pers.rush.beginner._24_访问权限控制_权限修饰词;

public class Cookie  {

    public Cookie() {
        System.out.println("Cookie constructor");
    }

    // 包访问权限等级
    void bite() { 
        System.out.println("bite()");
    }
    
    public static void main(String[] args) {
        
    }

}

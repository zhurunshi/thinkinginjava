package pers.rush.beginner._24_访问权限控制_权限修饰词;

public class Dinner {

    public static void main(String[] args) {
        Cookie cookie = new Cookie();
        cookie.bite(); // 缺省权限--包访问权限
    }

}

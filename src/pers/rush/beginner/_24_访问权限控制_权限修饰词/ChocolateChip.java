package pers.rush.beginner._24_访问权限控制_权限修饰词;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }
    public void chomp() {
        // protected是指子类能使用父类的方法,即使不在同一个包内,也可以访问
        this.bite();
    }
    public static void main(String[] args) {
        ChocolateChip cc = new ChocolateChip();
        cc.chomp();
    }
}

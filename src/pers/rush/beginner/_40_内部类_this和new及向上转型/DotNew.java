package pers.rush.beginner._40_内部类_this和new及向上转型;

public class DotNew {
    public class Inner {
        public Inner() {
            System.out.println("DotNew.Inner");
        }
    }
    
    public static void main(String[] args) {
        DotNew dn = new DotNew();
        // 没提供其他方法,就想拿到内部对象实例
        DotNew.Inner dni = dn.new Inner(); // 拿外层类的对象实例.new
    }
}

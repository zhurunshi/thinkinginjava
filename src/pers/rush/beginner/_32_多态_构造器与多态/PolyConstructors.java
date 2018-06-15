package pers.rush.beginner._32_多态_构造器与多态;

/**
 * 字形
 * @author Rush
 *
 */
class Glyph{
    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(),radius=" + radius);
    }
    void draw() { // 重写了父类的绘制方法,new的是子类的对象,动态绑定,就调用子类的draw()
        System.out.println("RoundGlyph.draw(),radius=" + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        
        /*
         * Glyph() before draw()
           RoundGlyph.draw(),radius=0  此时radius还没初始化,所以是0
           Glyph() after draw()
           RoundGlyph.RoundGlyph(),radius=5
         */
        // 结论:不要再构造器里面调用方法做一些初始化的工作
        // 避免在构造器里调用其他方法,继承方式会造成方法绑定错误
        // 非要调用的话,安全的做法就是基类的方法做成final的
    }
}

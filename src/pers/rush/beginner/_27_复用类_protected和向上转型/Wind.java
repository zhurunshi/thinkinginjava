/**
 * 
 */
package pers.rush.beginner._27_复用类_protected和向上转型;

/**
 * 管乐器
 * @author Rush
 *
 */
public class Wind extends Instrument{

    /**
     * @param args
     */
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
        /* 
         * 组合和继承,怎么选择?
         * 看看是不是会用到向上转型,如果用到,则使用继承
         * 应慎用继承
         */
    }

}

/**
 * 乐器
 * @author Rush
 *
 */
class Instrument {
    public void play() {}
    static void tune(Instrument instrument) {
        instrument.play();
    }
}
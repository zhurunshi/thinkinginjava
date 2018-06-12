package pers.rush.beginner._30_多态_再论向上转型;

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.Middle_C);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // 把子类传给父类类型参数
    }
}

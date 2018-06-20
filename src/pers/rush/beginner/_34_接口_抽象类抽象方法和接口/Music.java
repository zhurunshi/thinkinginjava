package pers.rush.beginner._34_接口_抽象类抽象方法和接口;

enum Note{
    MIDDLE_C,
    C_SHARP,
    B_FLAT;
}
// 只要类内有一个方法是抽象的,那么类也必须是抽象的
abstract class Instrument {
    abstract void play(Note n) ;
    String what() {
        return "Instrument";
    }
    void adjust() {
        System.out.println("Instrument.adjust()");
    }
}

/*
 * 1.抽象的子类可以继承抽象的父类
 * 2.抽象类只能声明,不能创建
 * 3.抽象类可以没有抽象方法
 * 4.但是只要有一个抽象方法,那么类就要是抽象的
 */
abstract class Instrument2 extends Instrument {
    
}

class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play()");
    }
    String what() {
        return "Wind";
    }
    void adjust() {
        System.out.println("Wind.adjust()");
    }
}

class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play()");
    }
    String what() {
        return "Stringed";
    }
    void adjust() {
        System.out.println("Stringed.adjust()");
    }
}

class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play()");
    }
    String what() {
        return "Percussion";
    }
    void adjust() {
        System.out.println("Percussion.adjust()");
    }
}

class Brass extends Instrument {
    void play(Note n) {
        System.out.println("Brass.play()");
    }
    String what() {
        return "Brass";
    }
    void adjust() {
        System.out.println("Brass.adjust()");
    }
}

class Woodwind extends Instrument {
    void play(Note n) {
        System.out.println("Woodwind.play()");
    }
    String what() {
        return "Woodwind";
    }
    void adjust() {
        System.out.println("Woodwind.adjust()");
    }
}

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.B_FLAT);
    }
    public static void tuneAll(Instrument[] i) {
        for (Instrument instrument : i) {
            tune(instrument);
        }
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // 后期绑定,动态绑定,判断对象的类型,调用对象的方法
        // java的方法除了static private final修饰的方法,全是后期绑定(动态绑定)
        System.out.println("--------------------------------------------");
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
        
    }
}

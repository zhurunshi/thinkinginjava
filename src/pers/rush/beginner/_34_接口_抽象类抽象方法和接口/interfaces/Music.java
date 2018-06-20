package pers.rush.beginner._34_接口_抽象类抽象方法和接口.interfaces;

import pers.rush.beginner._34_接口_抽象类抽象方法和接口.interfaces.Brass;
import pers.rush.beginner._34_接口_抽象类抽象方法和接口.interfaces.Instrument;
import pers.rush.beginner._34_接口_抽象类抽象方法和接口.interfaces.Note;
import pers.rush.beginner._34_接口_抽象类抽象方法和接口.interfaces.Percussion;
import pers.rush.beginner._34_接口_抽象类抽象方法和接口.interfaces.Stringed;
import pers.rush.beginner._34_接口_抽象类抽象方法和接口.interfaces.Wind;
import pers.rush.beginner._34_接口_抽象类抽象方法和接口.interfaces.Woodwind;

enum Note{
    MIDDLE_C,
    C_SHARP,
    B_FLAT;
}

/*
 * 接口前可以加访问修饰符,如果不加,是当前包下可以访问的
 */
interface Instrument {
    /*
     * 接口前的方法默认都是public的且抽象的,加了也是多此一举
     */
    int VALUE = 5; // 不要把它重新复制,因为接口定义的数据成员是static且final的
    void play(Note n);
    void adjust();
}

/*
 * 1.抽象的子类可以继承抽象的父类
 * 2.抽象类只能声明,不能创建
 * 3.抽象类可以没有抽象方法
 * 4.但是只要有一个抽象方法,那么类就要是抽象的
 */

class Wind implements Instrument {
    /*
     * 访问修饰符只能大不能笑
     * 因为interface是public的,所以这里也必须是public的
     */
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() {
        return "Wind";
    }
    public void adjust() {
        System.out.println(this + ".adjust() ");
    }
}

class Stringed implements Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() {
        return "Stringed";
    }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Percussion implements Instrument {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    public String toString() {
        return "Percussion";
    }
    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
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

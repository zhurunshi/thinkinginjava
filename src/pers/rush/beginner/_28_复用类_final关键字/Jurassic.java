package pers.rush.beginner._28_复用类_final关键字;

final class Dinosaur { // final类不能被继承
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f() {}
}

class SubDinosaur extends Dinosaur {}

class MyString extends String {
    // Java类库中的String类就是final类型
}

class SmallBrain {}

public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
    }
}

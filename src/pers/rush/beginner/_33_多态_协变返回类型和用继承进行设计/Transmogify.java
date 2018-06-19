package pers.rush.beginner._33_多态_协变返回类型和用继承进行设计;

class Actor{
    public void act() {}
}

class HappyActor extends Actor{
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor{
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change() {
        actor = new SadActor();
    }
    public void performPlay() {
        actor.act();
    }
}

public class Transmogify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change(); // 动态的灵活性
        stage.performPlay();
        /*
         * 设计程序通用的准则:
         * 1.用继承来表达行为间的差异
         * 2.灵活性比较大考虑用组合
         * 3.继承时使用多态是为了扩展
         */
    }
}

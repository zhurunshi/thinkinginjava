package pers.rush.beginner._26_复用类_组合语法和继承语法;

class Game {
    Game(int i) {
        System.out.println("Game构造器");
    }
}

class BoardGame extends Game{
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame构造器");
    }
}

public class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println("Chess构造器");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}

package pers.rush.beginner._38_接口_嵌套接口及接口与工厂;

interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

/**
 * 跳棋
 */
class Checkers implements Game{
    private int moves = 0;
    private static final int MOVES = 3;
    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}

class CheckersFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new Checkers();
    }
    
}
/**
 * 国际象棋
 * @author Rush
 *
 */
class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}

class ChessFactory implements GameFactory {

    @Override
    public Game getGame() {
        return new Chess();
    }
    
}

public class Games {
    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while(s.move())
            ;
    }
    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}

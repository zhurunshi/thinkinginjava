package pers.rush.beginner._32_多态_构造器与多态;

class Shared{
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        System.out.println("Creating " + this);
    }
    public void addRef() {
        refCount++;
    }
    protected void dispose() {
        if (--refCount == 0) {
            System.out.println("Disposing "+ this);
        }
    }
    public String toString() {
        return "shared " + id;
    }
}

/**
 * 主键
 * @author Rush
 *
 */
class Composing{
    private Shared s;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared s) {
        System.out.println("Creating " + this);
        this.s = s;
        this.s.addRef();
    }
    protected void dispose() {
        System.out.println("Disposing "+ this);
        s.dispose();
    }
    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared s = new Shared();
        Composing[] composing = {
                new Composing(s),
                new Composing(s),
                new Composing(s),
                new Composing(s),
                new Composing(s)
        };
        for (Composing c : composing) {
            c.dispose();
        }
    }
}

package pers.rush.beginner._32_多态_构造器与多态;

class Characteristic{
    private String s;
    Characteristic(String s) {
        this.s = s;
        System.out.println("create Characteristic " + s);
    }
    protected void dispose() {
        System.out.println("dispose Characteristic " + s);
    }
}

class Description{
    private String s;
    Description(String s) {
        this.s = s;
        System.out.println("create Description " + s);
    }
    protected void dispose() {
        System.out.println("dispose Description " + s);
    }
}

// 生物
class LivingCreature {
    private Characteristic p = new Characteristic("is alive");
    private Description t = new Description("Basic Living Creature");
    LivingCreature() {
        System.out.println("create LivingCreature");
    }
    protected void dispose() {
        System.out.println("dispose LivingCreature");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("Animal not Vegetable");
    Animal() {
        System.out.println("create Animal");
    }
    protected void dispose() {
        System.out.println("dispose Animal");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("Both water and land");
    Amphibian() {
        System.out.println("create Amphibian");
    }
    protected void dispose() {
        System.out.println("dispose Amphibian");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

public class Frog extends Amphibian{
    private Characteristic p = new Characteristic("Croaks"); // 呱呱叫
    private Description t = new Description("Eats bugs");
    Frog() {
        System.out.println("create Frog");
    }
    protected void dispose() {
        System.out.println("dispose Frog");
        t.dispose();
        p.dispose();
        super.dispose();
    }
    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("Bye!");
        frog.dispose();
    }
}

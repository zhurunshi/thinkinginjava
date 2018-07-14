package pers.rush.beginner._36_接口_多重继承和通过继承来扩展接口;

interface Monster {
    void menace(); // 威胁/恐吓
    // 扩展接口,而不要改原先的接口内部的功能
}

interface DangerousMonster extends Monster{
    void destroy();
}

/**
 * 致命的
 * @author Rush
 *
 */
interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster{

    @Override
    public void menace() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }
     
}

/**
 * 吸血鬼
 * @author Rush
 *
 */
interface Vampire extends DangerousMonster, Lethal{
    // 接口可以多继承,但是类不能多继承
    void drinkBlood();
}

class VeryBadVampire implements Vampire {

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void menace() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void kill() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void drinkBlood() {
        // TODO Auto-generated method stub
        
    }
    
}

public class HorrorShow {
    
    static void u(Monster b) {
        b.menace();
    }
    
    static void v(DangerousMonster d) {
        d.destroy();
        d.menace();
    }
    
    static void w(Lethal l) {
        l.kill();
    }
    
    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }

}

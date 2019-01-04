package pers.rush.beginner._58_通过异常处理错误_异常的限制和构造器;

/**
 * 棒球
 * @author Rush
 */
class BaseballException extends Exception {}

/**
 * 违反规则
 * @author Rush
 */
class Foul extends BaseballException {}

/**
 * 打架斗殴
 * @author Rush
 */
class Strike extends BaseballException {}

/**
 * 一局
 * @author Rush
 */
abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {}
    /**
     * 击球
     * @throws Strike
     * @throws Foul
     * @author Rush
     */
    public abstract void atBat() throws Strike, Foul;
    public void walk() {}
}

/**
 * 暴风雨
 * @author Rush
 */
class StromException extends Exception {}

/**
 * 下雨
 * @author Rush
 */
class RainedOut extends StromException {}

/**
 * 抛出犯规
 * @author Rush
 */
class PopFoul extends Foul {} // 棒球类的孙子类

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
    
    /*
     * 因为基类构造器必须是以这样或那样的方式被调用
     * 派生类的异常说明必须包含基类的异常说明
     * 所以派生类构造器是不能捕获基类构造器的异常的
     */
    
    public StormyInning() throws RainedOut, BaseballException {}
    
    public StormyInning(String s) throws Foul, BaseballException {}
    
    public void event() {} // 该方法在父类中抛BaseballException,在接口中抛RainedOut
    /*
     * 派生类方法可以不抛出任何异常,即使是基类规定的异常
     * 因为即使基类的方法会抛出异常,这样做的话也不会破坏已有的程序
     * @see pers.rush.beginner._58_通过异常处理错误_异常的限制和构造器.Storm#rainHard()
     */
    
    @Override
    public void rainHard() throws RainedOut {
        
    }

    @Override
    public void atBat() throws PopFoul {
        /*
         * 方法抛出的异常只能比父类方法抛出异常的范围更小,不能更大
         */
    }
    
//    @Override
//    public void walk() throws PopFoul {} // 重写父类walk时没有抛出异常,不能多抛出异常
    
    public static void main(String[] args) {
        try {
            Storm ssi = new StormyInning();
        } catch (RainedOut e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (BaseballException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        try {
            StormyInning si = new StormyInning(); // 捕获构造器异常
            si.atBat(); // 捕获方法的异常
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        
        try {
            Inning i = new StormyInning();
            i.atBat();
            // 构造器按StormyInning抛异常
            // i.atBat(); 按照接口的方法抛异常
            /*
             * 方法的类型由方法的名称以及参数类型组成的
             * 不能基于异常说明来重载
             * 出现在基类的异常说明,不一定出现在派生类方法的异常说明
             * 子类继承时,方法抛出异常的范围只能小不能大
             */
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}

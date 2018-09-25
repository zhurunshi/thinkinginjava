package pers.rush.beginner._59_通过异常处理错误_异常匹配和其他可选方式;

/**
 * 烦恼
 * @author Rush
 */
class Annoyance extends Exception {}

/**
 * 打喷嚏
 * @author Rush
 */
class Sneeze extends Annoyance {}

public class Human {

    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }
        
        try {
            throw new Sneeze();
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }
        
        /*
         * 开发异常处理的初衷是方便程序员处理错误
         * 异常处理的重要原则是:
         * 只要你知道如何处理的情况下,才捕获异常.
         * 重要目标是:把错误处理的代码同错误发生的地点分离开
         * 这样使你能在一段代码中专注于要完成的事情
         * 至于如何处理错误,可以放到另一段代码中完成.
         * 主干代码就不会和错误处理逻辑混在一起
         */
        
    }

}

package pers.rush.beginner._55_通过异常处理错误_捕获异常和创建自定义异常;

class SimpleException extends Exception {
    
}

public class InheritingException {

    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }
    
    public static void main(String[] args) {
        /*
         * 发现错误的理想时期就是编译时。
         * 但不一定所有错误都能被发现。
         * 错误恢复：体现代码健壮。
         * 异常：指出乎意料
         * 异常情形：阻碍当前的方法或作用域继续执行的问题。
         * 所能做的就是从当前环境跳出来，把问题提交给上一层环境，这就是抛出异常。
         * ...
         * if (t == null)
         * throw new NullPointerException(); // 是Exception的子类
         * ...
         * 抛出异常后，就不会继续往下执行了
         * 寻找一个恰当的地方，能够继续处理程序。
         * 异常都有两个构造器，一个是无参构造器，一个是可以传递错误信息的构造器。
         * throw new NullPointerException("提示信息");
         * try-catch里面的参数必须是Exception的子类
         * try {
         *      f();
         * } catch (ExceptionType e) {
         *      // 捕获到对应的异常类时，要执行的代码
         * } catch (ExceptionType2 e) {
         * 
         * }
         * 异常处理在理论上有两种基本模型：
         * Java支持终止模型；另外叫恢复模型（遇见错误时，修正错误）。
         * 一般还是终止模型，由上层方法决定怎样处理；
         * 恢复模型，并不实用，加强耦合，不推荐。
         * 
         * 怎样创建自定义异常：从已有的异常类继承。
         */
        
        /*
         * 错误类型标识严重的程序运行问题。
         * 后面是Error的是错误类型，描述不应被应用程序捕获的反常的情况。
         */
        InheritingException sed = new InheritingException();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it!");
        }
    }

}

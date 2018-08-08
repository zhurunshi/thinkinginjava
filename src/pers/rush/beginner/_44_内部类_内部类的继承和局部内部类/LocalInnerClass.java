package pers.rush.beginner._44_内部类_内部类的继承和局部内部类;

interface Counter {
    int next();
}

public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name) {
        /**
         * 局部内部类(不能有访问修饰符)
         * @author Rush
         *
         */
        class LocalCounter implements Counter {
            
            public LocalCounter() {
                System.out.println("LocalCounter()");
            }
            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        }
        
        return new LocalCounter();
    }
    
    Counter getCounter2(final String name) {
        /**
         * 匿名内部类
         */
        return new Counter() {
            // 初始化块来初始化
            {
                System.out.println("Counter()");
            }

            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
            
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter c1 = lic.getCounter("本地的局部内部类"),
                c2 = lic.getCounter2("匿名内部类");
        for(int i = 0; i < 5; ++i) {
            System.out.println(c1.next());
        }
        for(int i = 0; i < 5; ++i) {
            System.out.println(c2.next());
        }
        /*
         * 1.当需要用到构造函数时,用局部内部类
         * 2.需要的对象实例不只一个时,用局部内部类
         */
    }
}

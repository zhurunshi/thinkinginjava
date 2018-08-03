package pers.rush.beginner._43_内部类_为什么需要内部类.innerclasses;

public class GreenhouseConroller {
    public static void main(String[] args) {
        /*
         * 程序逻辑很乱,不太需要理解程序的意思
         */
        GreenhouseControllers gc = new GreenhouseControllers();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        gc.addEvent(new GreenhouseControllers.Terminate(new Integer(5000)));
        gc.run();
        /*
         * 整个例子就是根据控制框架的要求
         * 由内部类把实现细节封装起来
         * 完成基于事件的动作
         * 具体动作由内部类实现
         * 在内部类可以很容易访问外部类对象
         * 避免代码写的非常笨拙
         */
    }
}

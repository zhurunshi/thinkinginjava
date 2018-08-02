package pers.rush.beginner._43_内部类_为什么需要内部类.innerclasses;

public class GreenhouseConroller {
    public static void main(String[] args) {
        GreenhouseControllers gc = new GreenhouseControllers();
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new ThermostatDay(1400),
                
        };
    }
}

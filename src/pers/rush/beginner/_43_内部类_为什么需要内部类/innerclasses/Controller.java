package pers.rush.beginner._43_内部类_为什么需要内部类.innerclasses;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Event> parentEventList = new ArrayList<Event>();
    public void addEvent (Event e) {
        parentEventList.add(e);
    }
    public void run() {
        while (parentEventList.size() > 0) {
            for (Event e: new ArrayList<Event>(parentEventList)) {
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    parentEventList.remove(e);
                }
            }
        }
    }
    /*
     * 用内部类来改造
     */
}

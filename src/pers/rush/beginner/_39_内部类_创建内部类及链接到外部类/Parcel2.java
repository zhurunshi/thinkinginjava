package pers.rush.beginner._39_内部类_创建内部类及链接到外部类;

import pers.rush.beginner._39_内部类_创建内部类及链接到外部类.Parcel1.Contents;
import pers.rush.beginner._39_内部类_创建内部类及链接到外部类.Parcel1.Destination;

public class Parcel2 {
    class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    
    class Destination {
        private String label;
        public String getLabel() {
            return label;
        }
        Destination(String whereTo) {
            label = whereTo;
        }
    }
    
    // 返回内部类的对象
    public Destination to(String s) {
        return new Destination(s);
    }
    
    // 返回内部类的对象
    public Contents contents() {
        return new Contents();
    }
    
    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.getLabel());
    }
    
    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");
    }
}

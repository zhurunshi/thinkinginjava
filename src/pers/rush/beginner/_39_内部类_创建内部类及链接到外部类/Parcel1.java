package pers.rush.beginner._39_内部类_创建内部类及链接到外部类;

/**
 * 包裹1
 * @author Administrator
 *
 */
public class Parcel1 {

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
    
    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.getLabel());
    }
    
    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }
}

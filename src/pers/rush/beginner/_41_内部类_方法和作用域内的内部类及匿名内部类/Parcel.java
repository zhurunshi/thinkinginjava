package pers.rush.beginner._41_内部类_方法和作用域内的内部类及匿名内部类;

public class Parcel {
    public Destination destination(String s) {
        /**
         * 方法内的内部类
         * @author Rush
         *
         */
        class PDestination implements Destination {
            private String label;
            private PDestination(String whereto) {
                label = whereto;
            }
            @Override
            public String readLabel() {
                return label;
            }
            
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel p = new Parcel();
        Destination d = p.destination("Tasmania");
    }
}

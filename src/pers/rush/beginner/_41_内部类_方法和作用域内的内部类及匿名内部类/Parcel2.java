package pers.rush.beginner._41_内部类_方法和作用域内的内部类及匿名内部类;

public class Parcel2 {
    private void internalTracking(boolean b) {
        if (b) {
            /**
             * 写在方法作用域中的内部类
             * @author Rush
             *
             */
            class TrackingSlip {
                private String id;
                TrackingSlip(String s) {
                    id = s;
                }
                String getId() {
                    return id;
                }
            }
            TrackingSlip ts = new TrackingSlip("slip");
            String s = ts.getId();
            System.out.println(s);
        }
    }
    
    public void track() {
        internalTracking(true);
    }
    
    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.track();
        /*
         * 客户端不知道这个类
         * 对外也不知道这个类
         * 只知道调用了这个方法
         */
    }
}

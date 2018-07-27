package pers.rush.beginner._40_内部类_this和new及向上转型;

public class Parcel4 {
    private class PContents implements Contents{
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
        
    }
    
    protected class PDestination implements Destination {
        private String label;
        PDestination(String whereto) {
            label = whereto;
        }
        
        @Override
        public String getLabel() {
            return label;
        }
        
    }
    
    public Contents contents() {
        return new PContents();
    }
    
    public Destination destination(String s) {
        return new PDestination(s);
    }
    
}

class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        // 只能声明接口类型, 内部类是私有的
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
        Destination d1 = p.new PDestination("Tasmania"); 
    }
}
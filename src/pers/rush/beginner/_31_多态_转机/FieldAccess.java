package pers.rush.beginner._31_多态_转机;

class Super{
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super{
    public int field = 1;
    
    public int getField() {
        return field;
    }
    
    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field=" + sup.field + ",sup.getField()=" + sup.getField());
        Sub s = new Sub();
        System.out.println("s.field=" + s.field + ",s.getField()=" + s.getField());
        System.out.println("s.getSuperField()=" + s.getSuperField());
        
        // 域的访问操作是有编译器解析的,所以没有多态
        // 方法是多态的
        // 静态方法是不具有多态性的
    }
}

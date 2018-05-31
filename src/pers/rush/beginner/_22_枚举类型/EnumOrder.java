package pers.rush.beginner._22_枚举类型;

public class EnumOrder {

    public static void main(String[] args) {
        for(Spiciness s : Spiciness.values() ) {
            System.out.println(s + ", ordinal: " + s.ordinal());
        }
    }

}

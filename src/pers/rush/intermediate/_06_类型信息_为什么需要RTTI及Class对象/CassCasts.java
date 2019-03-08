package pers.rush.intermediate._06_类型信息_为什么需要RTTI及Class对象;

class Building {}

class House extends Building {}

public class CassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b); // 父类转换成子类对象,存到h里面,要求:必须实际的对象是子类才可以,否则会转换出错
        h = (House) b; // 也可以直接强转
    }

}

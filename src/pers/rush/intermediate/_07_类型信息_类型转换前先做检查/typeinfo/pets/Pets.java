package pers.rush.intermediate._07_类型信息_类型转换前先做检查.typeinfo.pets;

import pers.rush.intermediate._02_字符串_无意识递归及格式化输出.ArrayListDisplay;

import java.util.ArrayList;

public class Pets {
    public static final PetCreator creator = new LiteralPetCreator();
    public static Pet randomPet() {
        return creator.randomPet();
    }
    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
}

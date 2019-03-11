package pers.rush.intermediate._07_类型信息_类型转换前先做检查.typeinfo.pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 字面常量宠物创建
 */
public class LiteralPetCreator extends PetCreator {

    // 转换为不可修改的List
    public static final List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(Arrays.asList(
            Pet.class, Dog.class, Cat.class, Rodent.class,
            Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
            Cymric.class, Rat.class, Mouse.class, Hamster.class));

    private static final List<Class<? extends Pet>> types = allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());

    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
}

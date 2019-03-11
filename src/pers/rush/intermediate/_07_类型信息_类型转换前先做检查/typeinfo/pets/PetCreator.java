package pers.rush.intermediate._07_类型信息_类型转换前先做检查.typeinfo.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class PetCreator {
    private Random rand = new Random(47);

    public abstract List<Class<? extends Pet>> types(); // 必须返回宠物的子类

    public Pet randomPet() {
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch(InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for(int i = 0; i < size; ++i) {
            result[i] = randomPet();
        }
        return result;
    }

    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}

package pers.rush.intermediate._06_类型信息_为什么需要RTTI及Class对象;

import java.util.ArrayList;
import java.util.List;

class CountedInteger {
    private static long counter;
    private final long id = counter++;
    public String toString() {
        return Long.toString(id);
    }
}

/**
 * 泛型类
 * @param <T>
 */
public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type) {
        this.type = type;
    }
    public List<T> create(int nElements) {
        List<T> result = new ArrayList<>();
        try {
            for (int i = 0; i < nElements; ++i) {
                result.add(type.newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<CountedInteger> f1 = new FilledList<>(CountedInteger.class);
        System.out.println(f1.create(15));
    }
}

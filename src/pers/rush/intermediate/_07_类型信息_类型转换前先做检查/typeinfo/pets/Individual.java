package pers.rush.intermediate._07_类型信息_类型转换前先做检查.typeinfo.pets;

public class Individual implements Comparable<Individual>{
    private static long counter = 0;
    private final long id = counter++;
    private String name;
    public Individual(String name) {
        this.name = name;
    }
    public Individual() {}

    public String toString() {
        return getClass().getSimpleName() + (name == null ? "" : " " + name);
    }

    @Override
    public int compareTo(Individual o) {
        return 0;
    }
}

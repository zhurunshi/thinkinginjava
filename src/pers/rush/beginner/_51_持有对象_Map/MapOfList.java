package pers.rush.beginner._51_持有对象_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapOfList {
    public static Map<Person, List<String>> petPeople = new HashMap<>(); 
    static {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        List<String> list5 = new ArrayList<>();
        Collections.addAll(list1, "Molly Spot".split(" "));
        petPeople.put(new Person("Dawn"), list1);
        Collections.addAll(list2, "Shackleton Elsie May".split(" "));
        petPeople.put(new Person("Kate"), list2);
        Collections.addAll(list3, "Louie aka louis Snorkelst".split(" "));
        petPeople.put(new Person("Marilyn"), list3);
        Collections.addAll(list4, "Fuzzy".split(" "));
        petPeople.put(new Person("Luke"), list4);
        Collections.addAll(list5, "Freckly".split(" "));
        petPeople.put(new Person("Isaac"), list5);
    }
    public static void main(String[] args) {
        System.out.println("people: " + petPeople.keySet()); // 返回是所有key组成的Set
        System.out.println("string: " + petPeople.values()); // 返回集合
        for(Person p : petPeople.keySet()) {
            System.out.println(p + ":===============");
            for(String s : petPeople.get(p)) {
                System.out.println(s);
            }
        }
        // 先取出键的Set,然后再根据键,get值
        
        // 使用Iterator遍历
        Iterator<Entry<Person, List<String>>> it = petPeople.entrySet().iterator();
        while (it.hasNext()) {
            Entry<Person, List<String>> entry = it.next();
            System.out.println("key=" + entry.getKey() + " and value=" + entry.getValue());
        }
        
        // 直接用entry遍历(推荐)
        for (Entry<Person, List<String>> entry : petPeople.entrySet()) {
            System.out.println("key=" + entry.getKey() + " and value=" + entry.getValue());
        }
    }
}

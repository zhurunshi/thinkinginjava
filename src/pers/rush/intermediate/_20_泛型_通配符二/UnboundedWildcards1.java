 package pers.rush.intermediate._20_泛型_通配符二;

import java.util.ArrayList;
import java.util.List;

/**
  * 无界通配符<?>
  * @author Rush
  * @date 2020/02/11
  */
 public class UnboundedWildcards1 {
     static List list1;
     static List<?> list2;
     static List<? extends Object> list3;
     
     static void assign1(List list) {
         list1 = list;
         list2 = list;
         list3 = list;
     }
     static void assign2(List<?> list) {
         list1 = list;
         list2 = list;
         list3 = list;
     }
     static void assign3(List<? extends Object> list) {
         list1 = list;
         list2 = list;
         list3 = list;
     }
     
     public static void main(String[] args) {
         assign1(new ArrayList());
         assign2(new ArrayList());
         assign3(new ArrayList()); // 出现警告
         assign1(new ArrayList<String>());
         assign2(new ArrayList<String>());
         assign3(new ArrayList<String>());
         List<?> wildList = new ArrayList();
         wildList = new ArrayList<String>();
         assign1(wildList);
         assign2(wildList);
         assign3(wildList);
    }
}

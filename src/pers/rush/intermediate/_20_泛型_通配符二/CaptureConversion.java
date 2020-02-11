 package pers.rush.intermediate._20_泛型_通配符二;

import pers.rush.intermediate._19_泛型_通配符一.Holder;

/**
  * 捕获转换
  * @author Rush
  * @date 2020/02/11
  */
 public class CaptureConversion {
     static <T> void f1(Holder<T> holder) {
         T t = holder.getValue();
         System.out.println(t.getClass().getSimpleName());
     }
     static void f2(Holder<?> holder) {
         // 捕获转换
         f1(holder);
     }
     public static void main(String[] args) {
        Holder raw = new Holder<Integer>(1);
        f1(raw);
        f2(raw);
        Holder rawBasic = new Holder();
        rawBasic.setValue(new Object());
        f1(rawBasic);
        f2(rawBasic);
        Holder wilecarded = new Holder<Double>(1.0);
        f1(wilecarded);
        f2(wilecarded);
        // 捕获转换 屏蔽告警
    }
}

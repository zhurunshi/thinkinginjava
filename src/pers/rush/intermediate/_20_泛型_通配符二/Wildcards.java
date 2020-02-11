 package pers.rush.intermediate._20_泛型_通配符二;

import pers.rush.intermediate._19_泛型_通配符一.Holder;

/**
  * 通配符
  * @author Rush
  * @date 2020/02/11
  */
 public class Wildcards {
     /**
      * 原生参数
      * @param holder
      * @param arg
      */
     static void rawArgs(Holder holder, Object arg) {
         holder.setValue(arg); // 出现警告
         Object obj = holder.getValue();
     }
     /**
      * 无界参数
      * @param holder
      * @param arg
      */
     static void unboundedArgs(Holder<?> holder, Object arg) {
//         holder.setValue(arg); // 报错
         Object obj = holder.getValue();
     }
     /**
      * 精确方式
      * @param holder
      * @return
      */
     static <T> T exact1(Holder<T> holder) {
         T t = holder.getValue();
         return t;
     }
     
     static <T> T exact2(Holder<T> holder, T arg) {
         holder.setValue(arg);
         T t = holder.getValue();
         return t;
     }
     /**
      * 子类型通配符
      * @param holder
      * @param arg
      * @return
      */
     static <T> T wildSubtype(Holder<? extends T> holder, T arg) {
//         holder.setValue(arg); // 报错
         T t = holder.getValue();
         return t;
     
     }
     
     static <T> void wildSupertype(Holder<? super T> holder, T arg) {
         holder.setValue(arg); // 超类型可以set,但不能get
         Object obj = holder.getValue();
     }
     
     public static void main(String[] args) {
        Holder raw = new Holder<Long>();
        raw = new Holder();
        Holder<Long> qualified = new Holder<Long>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<? extends Long> bounded = new Holder<Long>();
        Long lng = 1L;
        rawArgs(raw, lng);
        rawArgs(qualified, lng);
        rawArgs(unbounded, lng);
        rawArgs(bounded, lng);
        unboundedArgs(raw, lng);
        unboundedArgs(qualified, lng);
        unboundedArgs(unbounded, lng);
        unboundedArgs(bounded, lng);
        
//        Long r1 = exact1(raw); // 返回Object类型,却用Long接收,所以报错
        Long r2 = exact1(qualified);
        Object r3 = exact1(unbounded);
        Long r4 = exact1(bounded);
        
        Long r6 = exact2(qualified, lng);
//        Long r7 = exact2(unbounded, lng);
//        Long r8 = exact2(bounded, lng);
        
        Long r9 = wildSubtype(raw, lng); // 出现警告
        Long r10 = wildSubtype(qualified, lng);
//        Long r11 = wildSubtype(unbounded, lng);
        Long r12 = wildSubtype(bounded, lng);
     
        wildSupertype(raw, lng); // 出现警告
        wildSupertype(qualified, lng);
//        wildSupertype(unbounded, lng);
//        wildSupertype(bounded, lng); 
     }
}

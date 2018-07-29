package pers.rush.beginner._42_内部类_嵌套类;

public interface ClassInInterface {
    void howdy();
    // 接口里面的class默认是static的
    class Test implements ClassInInterface{

        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }
        
        public static void main(String[] args) {
            new Test().howdy();
        }
        
    }
}

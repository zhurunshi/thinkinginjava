package pers.rush.beginner._58_通过异常处理错误_异常的限制和构造器;
public class Cleanup {

    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("Cleanup.java"); // 默认在项目根目录下查找
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null) {
                    
                }
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally { // 释放资源
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }
    }

}

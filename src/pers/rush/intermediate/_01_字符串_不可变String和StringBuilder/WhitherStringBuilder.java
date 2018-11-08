package pers.rush.intermediate._01_字符串_不可变String和StringBuilder;
public class WhitherStringBuilder {
    
    /**
     * 隐式的
     * @param fields
     * @return
     * @author Rush
     */
    public String implicit(String[] fields) {
        String result = "";
        for(int i = 0; i < fields.length; ++i) {
            result += fields[i]; // 产生很多String垃圾
        }
        return result;
    }
    /**
     * 显式的
     * @param fields
     * @return
     * @author Rush
     */
    public String explicit(String[] fields) {
        // 只创建一个StringBuilder,不会浪费资源
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < fields.length; ++i) {
            result.append(fields[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // explicit方法效率要高
    }

}

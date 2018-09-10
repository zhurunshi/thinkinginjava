package pers.rush.beginner._56_通过异常处理错误_捕获所有异常;

public class ExceptionMethods {

    public static void main(String[] args) {
        /*
         * 1.栈轨迹
         * 2.重新抛出异常
         * 3.异常链
         */
        /*try {
            
        } catch (NullPointerException e) {
            
        } catch (FileNotFoundException e) {
            
        } catch (Exception e) {
            e.getMessage();
            e.getLocalizedMessage();
            e.toString();
        }*/
        
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("e.getLocalizedMessage(): " + e.getLocalizedMessage()); // 本地消息
            System.out.println("e.toString(): " + e.toString());
            e.printStackTrace(System.out);
        }
    }

}

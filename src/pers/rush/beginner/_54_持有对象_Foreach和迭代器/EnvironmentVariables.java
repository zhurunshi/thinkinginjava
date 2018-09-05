package pers.rush.beginner._54_持有对象_Foreach和迭代器;

import java.util.Map;

public class EnvironmentVariables {
    
    public static void main(String[] args) {
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}

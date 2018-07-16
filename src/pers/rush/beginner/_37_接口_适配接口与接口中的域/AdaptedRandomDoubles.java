package pers.rush.beginner._37_接口_适配接口与接口中的域;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * 适配器模式
 * @author Rush
 *
 */
public class AdaptedRandomDoubles extends RandomDoubles implements Readable {

    private int count;
    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }
    
    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) { // 先判断是不是等于0,再--(优先级的作用)
            return -1;
        }
        String result = String.valueOf(next());
        cb.append(result);
        cb.append(" ");
        return cb.length();
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while(s.hasNext()) {
            System.out.println(s.nextDouble() + " ");
        }
        
    }
}

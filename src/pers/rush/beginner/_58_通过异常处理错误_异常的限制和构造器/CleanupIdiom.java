package pers.rush.beginner._58_通过异常处理错误_异常的限制和构造器;

class NeedsCleanup {
    private static long counter = 1;
    private final long id = counter++;
    
    public void dispose() {
        System.out.println("NeedsCleanup " + id + " disposed");
    }
}

class ConstructionException extends Exception {}

class NeedsCleanup2 extends NeedsCleanup {
    public NeedsCleanup2() throws ConstructionException {}
}



public class CleanupIdiom {

    public static void main(String[] args) {
        /* 1.遵循可去除对象后面紧跟着try-finally的原则,
         * 若对象构建时不会失败,则不需要try-finally语句
         */
        NeedsCleanup nc1 = new NeedsCleanup();
        try {
            
        } finally {
            nc1.dispose();
        }
        
        // 2.群组方式创建和清理
        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        
        try {
            
        } finally {
            nc3.dispose(); // Reverse order
            nc2.dispose();
        }
        
        // 3.嵌套释放资源
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {
                    
                } finally {
                    nc5.dispose();
                }
            } catch (ConstructionException e) {
                System.out.println(e);
            } finally {
                nc4.dispose();
            }
        } catch (ConstructionException e) {
            System.out.println(e);
        } 
    }

}

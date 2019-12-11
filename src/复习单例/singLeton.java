package 复习单例;

public class singLeton {
    //懒汉式
//    private static singLeton instance;
//    private singLeton(){}
//    public static singLeton getInstance(){
//        if(instance == null){
//            return new singLeton();
//        }
//        return instance;
//    }
    //饿汉式
//    private static final singLeton instance = new singLeton();
//    private singLeton(){}
//    public static singLeton getInstance(){
//        return instance;
//    }
    //线程安全的饿汉式
    private static volatile singLeton instance;
    private singLeton(){}
    public static singLeton getInstance(){
        if(instance == null){
            synchronized (singLeton.class){
                if(instance == null){
                    return instance = new singLeton();
                }
            }
        }
        return instance;
    }
}

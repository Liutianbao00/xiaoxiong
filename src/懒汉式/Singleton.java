package 懒汉式;

public class Singleton {
    //懒汉式
    //饿汉式
//    private static final Singleton instance = new Singleton();
//    private Singleton(){}
//    public static Singleton getInstance(){
//        return instance;
//    }
//    //懒汉式
//    private static Singleton instance;
//    private Singleton(){}
//    public static Singleton getInstance(){
//        if(instance == null){
//            return instance = new Singleton();
//        }
//        return instance;
//    }
//    //线程安全的懒汉式
//    private static volatile Singleton instance;
//    private Singleton(){}
//    public static Singleton getInstance(){
//        if (instance == null){
//            synchronized (Singleton.class){
//                if(instance == null){
//                    return instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }
//

}


/**
 * 懒汉
 * private static  Singleton instance;
 * private Singleton(){}
 * public static Singleton getInstance(){
 * if(stance == null){
 *     instance = new Singleton();
 *     }
 *     return stance;
 * }
 *
 * 饿汉式
 * private static final Singleton instance = new Singleton();
 * private Singleton(){}
 * public static Singleton getInstance(){
 *     return instance;
 * }
 */


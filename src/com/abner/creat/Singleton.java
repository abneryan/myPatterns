package com.abner.creat;

public class Singleton {
    //构造函数私有化
    private Singleton() {
    }

    //1,懒汉式-线程不安全
   /* private static Singleton mSingleton;
    public static Singleton getInstance(){
        if (mSingleton == null){
            mSingleton = new Singleton();
        }
        return mSingleton;
    }*/

    //2,饿汉式-线程安全
   /* private static Singleton mSingleton = new Singleton();
    public static Singleton getInstance(){
        return mSingleton;
    }*/

    //3,懒汉式-线程安全
   /* private static Singleton mSingleton;
    public static synchronized Singleton getInstance(){
        if(mSingleton == null){
            mSingleton = new Singleton();
        }
        return mSingleton;
    }*/
    //4,双重校验锁-线程安全
   /* private volatile static Singleton mSingleton;
    public static Singleton getInstance() {
        if (mSingleton == null) {
            synchronized (Singleton.class) {
                if (mSingleton == null) {
                    mSingleton = new Singleton();
                }
            }
        }
        return mSingleton;
    }*/
    //5,静态内部类 -线程安全
    /*private static class SingleHolder{
        private static final Singleton SINGLETON = new Singleton();
    }
    public static Singleton getInstance(){
        return SingleHolder.SINGLETON;
    }*/

    //6,枚举

    /**
     * 该实现可以防止反射攻击。在其它实现中，通过 setAccessible() 方法可以将私有构造函数的访问级别设置为 public，
     * 然后调用构造函数从而实例化对象，如果要防止这种攻击，需要在构造函数中添加防止多次实例化的代码。
     * 该实现是由 JVM 保证只会实例化一次，因此不会出现上述的反射攻击。
     * <p>
     * 该实现在多次序列化和序列化之后，不会得到多个实例。而其它实现需要使用 transient 修饰所有字段，并且实现序列化和反序列化的方法。
     */
    public enum EnumSingleton {
        ENUM_SINGLETON;
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 输出结果：
     * firstName
     * secondName
     * secondName
     * secondName
     *
     * @param args
     */
    public static void main(String[] args) {
        // 单例测试
        EnumSingleton firstSingleton = EnumSingleton.ENUM_SINGLETON;
        firstSingleton.setName("firstName");
        System.out.println(firstSingleton.getName());
        EnumSingleton secondSingleton = EnumSingleton.ENUM_SINGLETON;
        secondSingleton.setName("secondName");
        System.out.println(firstSingleton.getName());
        System.out.println(secondSingleton.getName());

        // 反射获取实例测试
        try {
            EnumSingleton[] enumConstants = EnumSingleton.class.getEnumConstants();
            for (EnumSingleton enumConstant : enumConstants) {
                System.out.println(enumConstant.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

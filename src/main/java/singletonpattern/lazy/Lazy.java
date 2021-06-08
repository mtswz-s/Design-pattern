package singletonpattern.lazy;

/**
 * @Author 麦田守望者
 * @Date 2020/8/13 8:50
 * @Version 1.0
 * 懒汉模式：内存消耗少
 */
public class Lazy {
    public static void main(String[] args) {
        Instance1 instance1 = Instance1.getInstance();
        Instance1 instance2 = Instance1.getInstance();
        System.out.println(instance1 == instance2);

        Instance2 instance3 = Instance2.getInstance();
        Instance2 instance4 = Instance2.getInstance();
        System.out.println(instance3 == instance4);

        Instance3 instance5 = Instance3.getInstance();
        Instance3 instance6 = Instance3.getInstance();
        System.out.println(instance5 == instance6);

        System.out.println(Instance4.INSTANCE == Instance4.INSTANCE);

    }
}

/**
 * 方式一：线程不安全
 */
class Instance1 {
    //私有化构造方法
    private Instance1() {

    }

    private static Instance1 instance;

    public static Instance1 getInstance() {
        if (instance == null) {
            instance = new Instance1();
        }
        return instance;
    }
}

/**
 * 方式二：线程安全使用同步代码块
 */
class Instance2 {
    //私有化构造方法
    private Instance2() {

    }

    private static volatile Instance2 instance;

    public static Instance2 getInstance() {
        //double-check双重检测
        if (instance == null) {
            synchronized (Instance2.class) {
                if (instance == null) {
                    instance = new Instance2();
                }
            }
        }
        return instance;
    }
}

/**
 * 方式三：线程安全使用静态内部类
 * 外部类在加载时内部类不会立即加载
 */
class Instance3 {
    //私有化构造方法
    private Instance3() {

    }
    private static class staticClass {
        private static final Instance3 instance = new Instance3();
    }
    public static Instance3 getInstance() {

        return staticClass.instance;
    }
}

/**
 * 方式四：线程安全使用枚举
 * 外部类在加载时内部类不会立即加载
 */
enum Instance4 {
    INSTANCE;
}
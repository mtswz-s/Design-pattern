package singletonpattern.hungry;

/**
 * @Author 麦田守望者
 * @Date 2020/8/13 8:09
 * @Version 1.0
 * 饿汉式单例模式：
 * 在类被加载时就创建对象，线程安全，浪费内存
 */
public class Hungry {
    public static void main(String[] args) {
        Instance instance1 = Instance.getInstance();
        Instance instance2 = Instance.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Instance {
    //私有化构造方法
    private Instance() {

    }
    //方式一定义全局唯一实例
    //private static final Instance instance = new Instance();
    //方式二在静态代码块中实例化对象
    final private static Instance instance;
    static{
         instance = new Instance();
    }

    public static Instance getInstance() {
        return instance;
    }
}
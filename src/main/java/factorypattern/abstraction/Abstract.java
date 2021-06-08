package factorypattern.abstraction;

/**
 * @Author 麦田守望者
 * @Date 2020/8/14 15:22
 * @Version 1.0
 * 抽象工厂模式
 */
public class Abstract {
    public static void main(String[] args) {
        Factory expensiveFactory = new ExpensiveFactory();
        Engine engine = expensiveFactory.createEngine();
        engine.desc();
        Tyre tyre = expensiveFactory.createTyre();
        tyre.desc();
    }
}

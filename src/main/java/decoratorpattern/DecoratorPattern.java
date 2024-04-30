package decoratorpattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/17 9:12
 * @Version 1.0
 * 装饰者模式
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Milk milk = new Milk(new Starbucks());
        System.out.println(milk.getPrice());
        System.out.println(milk.getDesc());
        System.out.println(new Milk(milk).getPrice());
        System.out.println(new Milk(milk).getDesc());
    }
}

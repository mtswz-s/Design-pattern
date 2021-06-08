package decoratorpattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/17 9:12
 * @Version 1.0
 * 装饰者模式
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Mike mike = new Mike(new Starbucks());
        System.out.println(mike.getPrice());
        System.out.println(mike.getDesc());
        System.out.println(new Mike(mike).getPrice());
        System.out.println(new Mike(mike).getDesc());
    }
}

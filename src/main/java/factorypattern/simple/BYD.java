package factorypattern.simple;

/**
 * @Author 麦田守望者
 * @Date 2020/8/14 14:38
 * @Version 1.0
 */
public class BYD implements Car {
    @Override
    public void run() {
        System.out.println("比亚迪");
    }
}

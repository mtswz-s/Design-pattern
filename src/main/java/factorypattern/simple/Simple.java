package factorypattern.simple;

/**
 * @Author 麦田守望者
 * @Date 2020/8/14 14:36
 * @Version 1.0
 * 简单工厂模式：
 * 不符合ocp开闭原则
 */
public class Simple {
    public static void main(String[] args) {
        Car car = CarFactory.creatCar("比亚迪");
        car.run();
    }
}

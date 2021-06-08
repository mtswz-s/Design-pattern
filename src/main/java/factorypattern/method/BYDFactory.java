package factorypattern.method;

/**
 * @Author 麦田守望者
 * @Date 2020/8/14 14:56
 * @Version 1.0
 */
public class BYDFactory implements CarFactory {
    @Override
    public Car creatCar() {
        return new BYD();
    }
}

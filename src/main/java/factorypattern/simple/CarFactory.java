package factorypattern.simple;

/**
 * @Author 麦田守望者
 * @Date 2020/8/14 14:40
 * @Version 1.0
 */
public class CarFactory {
    public static Car creatCar(String carName) {
        Car car = null;
        if ("奔驰".equals(carName)) {
            car = new BENZ();
        } else if ("比亚迪".equals(carName)) {
            car = new BYD();
        }
        return car;
    }
}

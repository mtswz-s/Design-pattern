package facadepattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 8:09
 * @Version 1.0
 * 外观模式
 */
public class FacadePattern {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.start();
        facade.run();
        facade.shutDown();
    }
}

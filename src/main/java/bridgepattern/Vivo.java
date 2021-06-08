package bridgepattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/16 14:44
 * @Version 1.0
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("vivo手机开机");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话📞");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机");
    }
}

package bridgepattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/16 15:06
 * @Version 1.0
 */
public class ClamshellPhone extends Phone {
    public ClamshellPhone(Brand brand) {
        super(brand);
    }

    @Override
    void open() {
        super.open();
        System.out.println("翻盖式");
    }

    @Override
    void call() {
        super.call();
        System.out.println("翻盖式");
    }

    @Override
    void close() {
        super.close();
        System.out.println("翻盖式");
    }
}

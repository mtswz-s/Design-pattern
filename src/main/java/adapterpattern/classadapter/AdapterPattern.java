package adapterpattern.classadapter;

/**
 * @Author 麦田守望者
 * @Date 2020/8/16 8:13
 * @Version 1.0
 * 类适配器
 */
public class AdapterPattern {
    public static void main(String[] args) {
        Phone phone = new Phone();
        ElectricAdapter sourceV5 = new ElectricSourceV5();
        phone.charge(sourceV5);
    }
}

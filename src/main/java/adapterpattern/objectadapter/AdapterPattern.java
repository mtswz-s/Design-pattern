package adapterpattern.objectadapter;

/**
 * @Author 麦田守望者
 * @Date 2020/8/16 8:13
 * @Version 1.0
 * 对象适配器(通过聚合方式集成ElectricSourceV220降低耦合度)
 */
public class AdapterPattern {
    public static void main(String[] args) {
        Phone phone = new Phone();
        ElectricAdapter sourceV5 = new ElectricSourceV5(new ElectricSourceV220());
        phone.charge(sourceV5);
    }
}

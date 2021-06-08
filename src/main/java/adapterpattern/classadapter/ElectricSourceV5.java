package adapterpattern.classadapter;

/**
 * @Author 麦田守望者
 * @Date 2020/8/16 8:09
 * @Version 1.0
 * 适配器子类
 */
public class ElectricSourceV5 extends ElectricSourceV220 implements ElectricAdapter {
    @Override
    public int change() {
        return output()/44;
    }
}

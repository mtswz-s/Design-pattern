package adapterpattern.objectadapter;

/**
 * @Author 麦田守望者
 * @Date 2020/8/16 8:09
 * @Version 1.0
 * 适配器子类
 */
public class ElectricSourceV5 implements ElectricAdapter {
    private ElectricSourceV220 sourceV220;

    public ElectricSourceV5(ElectricSourceV220 sourceV220) {
        this.sourceV220 = sourceV220;
    }

    @Override
    public int change() {
        return sourceV220.output()/44;
    }
}

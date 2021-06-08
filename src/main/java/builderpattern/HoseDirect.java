package builderpattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/15 15:15
 * @Version 1.0
 * 封装了建房子的顺序以及建造房子（组装）
 */
public class HoseDirect {
    private HoseBuilder builder;

    public HoseDirect(HoseBuilder builder) {
        this.builder = builder;
    }
    public Hose buildHose(){
        builder.buildBase();
        builder.buildRoof();
        builder.renovation();
        return builder.buildHose();
    }
}

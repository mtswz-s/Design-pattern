package builderpattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/15 15:07
 * @Version 1.0
 * 封装了建房子所需要的步骤（建造）
 */
public abstract class HoseBuilder {
    protected Hose hose = new Hose();

    public abstract void buildBase();

    public abstract void buildRoof();

    public abstract void renovation();

    public Hose buildHose() {
        return hose;
    }
}

package builderpattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/15 15:11
 * @Version 1.0
 */
public class ExpensiveHose extends HoseBuilder{
    @Override
    public void buildBase() {
        super.hose.setBase("ExpensiveBase");
        System.out.println("建造昂贵的地基");
    }

    @Override
    public void buildRoof() {
        super.hose.setRoof("ExpensiveRoof");
        System.out.println("建造昂贵的房顶");
    }

    @Override
    public void renovation() {
        super.hose.setRenovation("ExpensiveRenovation");
        System.out.println("昂贵的装修");
    }
}

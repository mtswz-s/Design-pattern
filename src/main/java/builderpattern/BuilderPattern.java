package builderpattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/15 15:19
 * @Version 1.0
 */
public class BuilderPattern {
    public static void main(String[] args) {
        ExpensiveHose expensiveHose = new ExpensiveHose();
        HoseDirect hoseDirect = new HoseDirect(expensiveHose);
        Hose hose = hoseDirect.buildHose();
        System.out.println(hose);
    }
}

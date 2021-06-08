package factorypattern.abstraction;

/**
 * @Author 麦田守望者
 * @Date 2020/8/14 15:23
 * @Version 1.0
 */
public interface Engine {
    public void desc();
}
class ExpensiveEngine implements Engine{

    @Override
    public void desc() {
        System.out.println("expensiveEngine");
    }
}
class CheapEngine implements Engine{

    @Override
    public void desc() {
        System.out.println("cheapEngine");
    }
}

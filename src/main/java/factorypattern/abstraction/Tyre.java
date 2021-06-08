package factorypattern.abstraction;

import java.lang.reflect.Type;

/**
 * @Author 麦田守望者
 * @Date 2020/8/14 15:26
 * @Version 1.0
 */
public interface Tyre {
    public void desc();
}

class ExpensiveTyre implements Tyre {

    @Override
    public void desc() {
        System.out.println("expensiveTyre");
    }
}

class CheapTyre implements Tyre {

    @Override
    public void desc() {
        System.out.println("cheapTyre");
    }
}

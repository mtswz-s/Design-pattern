package factorypattern.abstraction;

/**
 * @Author 麦田守望者
 * @Date 2020/8/14 15:29
 * @Version 1.0
 */
public interface Factory {
    Engine createEngine();
    Tyre createTyre();
}
class ExpensiveFactory implements Factory{

    @Override
    public Engine createEngine() {
        return new ExpensiveEngine();
    }

    @Override
    public Tyre createTyre() {
        return new ExpensiveTyre();
    }
}

class CheapFactory implements Factory{

    @Override
    public Engine createEngine() {
        return new CheapEngine();
    }

    @Override
    public Tyre createTyre() {
        return new CheapTyre();
    }
}

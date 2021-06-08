package facadepattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 8:04
 * @Version 1.0
 */
public class Facade {
    private Popcorn popcorn;
    private TV tv;

    public Facade() {
        this.popcorn = Popcorn.getInstance();
        this.tv = TV.getInstance();
    }

    public void start(){
        popcorn.open();
        tv.open();
    }

    public void run(){
        popcorn.run();
        tv.run();
    }

    public void shutDown(){
        popcorn.close();
        tv.close();
    }
}

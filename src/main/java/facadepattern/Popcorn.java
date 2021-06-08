package facadepattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 7:56
 * @Version 1.0
 * 爆米花类
 */
public class Popcorn {
    private static Popcorn popcorn = new Popcorn();

    private Popcorn() {

    }

    public static Popcorn getInstance(){
        return popcorn;
    }

    public void open(){
        System.out.println("打开爆米花");
    }

    public void run(){
        System.out.println("吃爆米花");
    }

    public void close(){
        System.out.println("爆米花吃完了，丢弃垃圾");
    }

}

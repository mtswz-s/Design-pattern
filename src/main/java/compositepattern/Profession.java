package compositepattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/17 15:04
 * @Version 1.0
 */
public class Profession extends Organization {
    public Profession(String name, String desc) {
        super(name, desc);
    }


    @Override
    public void show() {
        System.out.println("---------------"+getName()+":"+getDesc()+"---------------");
    }
}

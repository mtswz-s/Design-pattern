package prototypepattern.deepcopy.mode1;

/**
 * @Author 麦田守望者
 * @Date 2020/8/15 8:16
 * @Version 1.0
 */
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private Dog friend;

    public Sheep(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog getFriend() {
        return friend;
    }

    public void setFriend(Dog friend) {
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o =  super.clone();
        Sheep sheep = (Sheep) o;
        sheep.setFriend((Dog) this.getFriend().clone());
        return sheep;
    }
}

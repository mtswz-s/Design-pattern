package prototypepattern;

/**
 * @Author 麦田守望者
 * @Date 2020/8/15 8:15
 * @Version 1.0
 * 原型模式:默认浅拷贝
 */
public class Prototype {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("多莉",6);
        sheep.setFriend(new Sheep("tom",7));
        try {
            Sheep sheep2 = (Sheep)sheep.clone();
            Sheep sheep3 = (Sheep)sheep.clone();
            System.out.println(sheep2 == sheep3);//false
            System.out.println(sheep2.getFriend() == sheep3.getFriend());//true
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

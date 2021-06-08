package prototypepattern.deepcopy.mode1;

/**
 * @Author 麦田守望者
 * @Date 2020/8/15 8:15
 * @Version 1.0
 * 深拷贝：方式一：
 * 逐一拷贝目标对象的引用数据类型（不推荐）
 */
public class Prototype {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("多莉",6);
        sheep.setFriend(new Dog("tom",7));
        try {
            Sheep sheep2 = (Sheep)sheep.clone();
            Sheep sheep3 = (Sheep)sheep.clone();
            System.out.println(sheep2 == sheep3);//false
            System.out.println(sheep2.getFriend() == sheep3.getFriend());//false
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
